import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class HRapp {
    private List<Employee> employees;

    public HRapp() {
        employees = new ArrayList<>();
    }
    private Connection getConnection() {
        try {
            String url = "jdbc:mysql://localhost:3306/hrapp_db2";
            String username = "root";
            String password = "Quanlynhansu2023@";
            return DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    public void insertEmployees(Employee employee) {
        try (Connection connection = getConnection()) {
            String query = "INSERT INTO Employee(id,name,salary,identification,birthdate,birthplace,gender,nationality,insurance,workingStatus,grantPlace,location,educationLevel,literacyLevel,position,seniority,grantDate,contractType,monthWithoutPay,startDate,endDate,monthsForNextPayRaise,overtimeHourseMonthly,overtimeHoursAnnually,training,disciplinary,work_relatedDiseases,accident,retirementDate,Vet,note,department,leaveAllowance)" +
                    "VALUE(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, employee.getId());
            preparedStatement.setString(2, employee.getName());
            preparedStatement.setDouble(3, employee.getSalary());
            preparedStatement.setInt(4, employee.getIdentification());
            preparedStatement.setDate(5, new java.sql.Date(employee.getBirthdate().getTime()));
            preparedStatement.setString(6, employee.getBirthplace());
            preparedStatement.setString(7, employee.getGender());
            preparedStatement.setString(8, employee.getNationality());
            preparedStatement.setString(9, employee.getInsurance());
            preparedStatement.setString(10, employee.getWorkingStatus());
            preparedStatement.setString(11, employee.getGrantPlace());
            preparedStatement.setString(12, employee.getLocation());
            preparedStatement.setString(13, employee.getEducationLevel());
            preparedStatement.setString(14, employee.getLiteracylevel());
            preparedStatement.setString(15, employee.getPosition());
            preparedStatement.setString(16, employee.getSeniority());
            preparedStatement.setDate(17, new java.sql.Date(employee.getGrantDate().getTime()));
            preparedStatement.setString(18, employee.getContractType());
            preparedStatement.setInt(19, employee.getMonthWithoutPay());
            preparedStatement.setDate(20, new java.sql.Date(employee.getStartDate().getTime()));
            preparedStatement.setDate(21, new java.sql.Date(employee.getEndDate().getTime()));
            preparedStatement.setInt(22, employee.getMonthsForNextPayRaise());
            preparedStatement.setInt(23, employee.getOvertimeHourseMonthly());
            preparedStatement.setInt(24, employee.getMonthsForNextPayRaise());
            preparedStatement.setString(25, employee.getTraining());
            preparedStatement.setString(26, employee.getDisciplinary());
            preparedStatement.setString(27, employee.getWork_relatedDiseases());
            preparedStatement.setString(28, employee.getAccident());
            preparedStatement.setDate(29, new java.sql.Date(employee.getRetirementDate().getTime()));
            preparedStatement.setString(30, employee.getVet());
            preparedStatement.setString(31, employee.getNote());
            preparedStatement.setString(32, employee.getDepartment());
            preparedStatement.setInt(33, employee.getLeaveAllowance());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void loadEmployees() {
        try (Connection connection = getConnection()) {
            String query = "SELECT * FROM Employee";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                // Create Employee objects from the retrieved data and add them to the employees list
                Employee employee = new Employee(
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getDouble("salary"),
                        resultSet.getInt("identification"),
                        resultSet.getDate("birthdate"),
                        resultSet.getString("birthplace"),
                        resultSet.getString("gender"),
                        resultSet.getString("nationality"),
                        resultSet.getString("insurance"),
                        resultSet.getString("workingStatus"),
                        resultSet.getString("grantPlace"),
                        resultSet.getString("location"),
                        resultSet.getString("educationLevel"),
                        resultSet.getString("literacyLevel"),
                        resultSet.getString("position"),
                        resultSet.getString("seniority"),
                        resultSet.getDate("grantDate"),
                        resultSet.getString("contractType"),
                        resultSet.getInt("monthWithoutPay"),
                        resultSet.getDate("startDate"),
                        resultSet.getDate("endDate"),
                        resultSet.getInt("monthsForNextPayRaise"),
                        resultSet.getInt("overtimeHourseMonthly"),
                        resultSet.getInt("overtimeHoursAnnually"),
                        resultSet.getString("training"),
                        resultSet.getString("disciplinary"),
                        resultSet.getString("work_relatedDiseases"),
                        resultSet.getString("accident"),
                        resultSet.getDate("retirementDate"),
                        resultSet.getString("Vet"),
                        resultSet.getString("note"),
                        resultSet.getString("department"),
                        resultSet.getInt("leaveAllowance")
                );

                employees.add(employee);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void saveEmployees() {
        try (Connection connection = getConnection()) {
            // First, delete all existing data from the table
            String deleteQuery = "DELETE FROM Employee";
            PreparedStatement deleteStatement = connection.prepareStatement(deleteQuery);
            deleteStatement.executeUpdate();

            // Now, insert all the current employees into the table
            for (Employee employee : employees) {
                insertEmployees(employee);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void deleteEmployeeById(int employeeId) {
        Employee employeeToRemove = findEmployeeById(employeeId);
        if (employeeToRemove == null) {
            System.out.println("Employee with ID " + employeeId + " not found.");
            return;
        }

        try (Connection connection = getConnection()) {
            String query = "DELETE FROM Employee WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, employeeId);
            preparedStatement.executeUpdate();

            employees.remove(employeeToRemove);

            System.out.println("Employee with ID " + employeeId + " removed successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }




    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public Employee findEmployeeById(int id) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }

    public void updateEmployeeAttendance(int id) {
        Employee employee = findEmployeeById(id);
        if (employee != null) {
            employee.updatedAttendance();
            System.out.println("Attendance updated for employee: " + employee.getName());
        } else {
            System.out.println("Employee not found");
        }
    }

    public void increaseEmployeeLeaveAllowance(int id) {
        Employee employee = findEmployeeById(id);
        if (employee != null) {
            Date currentDate = new Date();
            Date startDate = employee.getStartDate();
            long durationInMillis = currentDate.getTime() - startDate.getTime();
            long durationInYears = durationInMillis / (1000L * 60 * 60 * 24 * 365);

            int leaveIncrease = (int) (durationInYears / 5);
            if (leaveIncrease > 0) {
                for (int i = 0; i < leaveIncrease; i++) {
                    employee.increaseLeaveAllowance();
                }
                System.out.println("Leave allowance increased for employee: " + employee.getName());
            } else {
                System.out.println("Employee has not worked long enough for a leave allowance increase.");
            }
        } else {
            System.out.println("Employee not found.");
        }
    }
    public boolean employeeChecker(int id){
        for(Employee employee: employees) {
            if (employee.getId() == id) {
                System.out.println("There is an employee");
                return true;
            }
        }
        return false;
        }


public void resetLeaveAllowance(int id, int leaveAllowance){
        Employee employee= findEmployeeById(id);
        if(employee!=null){
            employee.setLeaveAllowance(leaveAllowance);
            System.out.println("Employee: "+employee.getName()+" new leave allowance is:"+employee.getLeaveAllowance());
        } else{
            System.out.println("Employee not found");
        }
}
public void updateEmployeeLeaveAllowance(int id){
        Employee employee=findEmployeeById(id);
        if(employee!=null){
            employee.updatedLeaveAllowance();
            System.out.println("Employee: "+employee.getName()+" new leave allowance is: "+employee.getLeaveAllowance());
        }
}

    public void removeEmployee(int id) {
        Employee employee = findEmployeeById(id);
        if (employee != null) {
            employees.remove(employee);
            System.out.println("Employee: " + employee.getName() + " has been removed");
        } else {
            System.out.println("Employee not found");
        }
    }
    public void viewMonthsLeftForNextPayRaise(int id){
        Employee employee=findEmployeeById(id);
        if(employee!=null){
          System.out.println("Employee: "+employee.getName()+" months left for next payraise is: "+employee.getMonthsForNextPayRaise());
        }
    }
    public void updateMonthsForNextPayRaise(int id){
        Employee employee=findEmployeeById(id);
        if(employee!=null){
            employee.updateMonthsForNextPayRaise();
            System.out.println("Employee: "+employee.getName()+" months left for next payraise is: "+employee.getMonthsForNextPayRaise());
        }
    }
    public void updateSalary(int id, int months, double salary) {
        Employee employee = findEmployeeById(id);
        if (employee != null) {
            if (employee.getMonthsForNextPayRaise() == 0) {
                employee.setSalary(salary);
                employee.setMonthsForNextPayRaise(months);
                System.out.println("Employee: " + employee.getName() + " new salary is: " + employee.getSalary());
            }
            else{
                System.out.println("Employee: "+employee.getName()+" has not worked long enough");
            }
        }
    }


    public void increaseEmployeeMonthWithoutPay(int id){
        Employee employee=findEmployeeById(id);
      if(employee!=null){
          employee.increaseMonthWithoutPay();
          System.out.println("Employee: "+employee.getName()+"new month without pay is: "+employee.getMonthWithoutPay());
      }
    }
    public void viewEmployeeWithoutPay(int id){
        Employee employee=findEmployeeById(id);
        if(employee!=null){
          System.out.println("Employee:"+employee.getName()+"month without pay is "+employee.getMonthWithoutPay());
        }
    }
    public void decreaseEmployeeWithoutPay(int id){
        Employee employee=findEmployeeById(id);
        if(employee!=null){
            employee.decreaseMonthWithoutPay();
            System.out.println("Employee: "+employee.getName()+" new month without pay is "+employee.getMonthWithoutPay());
        }
    }

    public void printEmployeeDetails(int id) {
        Employee employee = findEmployeeById(id);
        if (employee != null) {
            System.out.println(employee.getEmployee());
        } else {
            System.out.println("Employee not found");
        }
    }
    public void updateEmployeeContractType(int id,String contractType){
        Employee employee=findEmployeeById(id);
        if(employee!=null){
            employee.setContractType(contractType);
            System.out.println("Employee: "+employee.getName()+" contract type has been updated");
            System.out.println("Employee: "+employee.getName()+"is now a: "+employee.getContractType()+" employee");
        }
    }
    public void updateWorkingStatus(int id, String workingStatus){
        Employee employee=findEmployeeById(id);
        if(employee!=null){
            employee.setWorkingStatus(workingStatus);
            System.out.println("Employee: "+employee.getName()+" working status has been updated");
            System.out.println("Employee: "+employee.getName()+" is now working: "+employee.getWorkingStatus());
        }
    }
    public void updatePosition(int id, String position){
        Employee employee=findEmployeeById(id);
        if(employee!=null){
            employee.setPosition(position);
            System.out.println("Employee: "+employee.getName()+" is now working as "+employee.getPosition());
        }
    }
    public void updateSeniority(int id,String seniority){
        Employee employee=findEmployeeById(id);
        if(employee!=null){
            employee.setSeniority(seniority);
            System.out.println("Employee: "+employee.getName()+" is now working as "+employee.getSeniority());
        }
    }
    public void updateDepartment(int id,String department){
        Employee employee=findEmployeeById(id);
        if(employee!=null){
            employee.setDepartment(department);
            System.out.println("Employee: "+employee.getName()+" is now working in "+employee.getDepartment());
        }
    }
    public void updateTraining(int id, String training){
        Employee employee=findEmployeeById(id);
        if(employee!=null){
            employee.setTraining(training);
            System.out.println("Employee: "+employee.getName()+" is now receiving "+employee.getTraining());
        }
    }
    public void updateAccident(int id, String accident){
        Employee employee=findEmployeeById(id);
        if(employee!=null){
            employee.setAccident(accident);
            System.out.println("Employee: "+employee.getName()+" suffer from "+employee.getAccident());
        }
    }
    public void updateDiseases(int id,String diseases){
        Employee employee=findEmployeeById(id);
        if(employee!=null){
            employee.setWork_relatedDiseases(diseases);
            System.out.println("Employee: "+employee.getName()+" suffer from "+employee.getWork_relatedDiseases());
        }
    }
    public void updateDisciplinary(int id, String disciplinary){
        Employee employee=findEmployeeById(id);
        if(employee!=null){
            employee.setDisciplinary(disciplinary);
            System.out.println("Employee "+employee.getName()+" suffer from "+employee.getDisciplinary());
        }
    }
    public void updateOvertimeMonthly(int id,int monthly){
        Employee employee=findEmployeeById(id);
        if(employee!=null){
            employee.setOvertimeHourseMonthly(monthly);
            System.out.println("Employee "+employee.getName()+" working "+employee.getOvertimeHourseMonthly()+" hours extra last month");
        }
    }
    public void updateOvertimeAnnually(int id, int annually){
        Employee employee=findEmployeeById(id);
        if(employee!=null){
            employee.setOvertimeHoursAnnually(annually);
            System.out.print("Employee "+employee.getName()+" working "+employee.getOvertimeHoursAnnually()+" hours extra last year");
        }
    }
    public void updateNote(int id, String note){
        Employee employee=findEmployeeById(id);
        if(employee!=null){
            employee.setNote(note);
            System.out.println("Employee "+employee.getName()+" "+employee.getNote());
        }
    }
    public void updateEndDate(int id,Date endDate){
        Employee employee=findEmployeeById(id);
        if(employee!=null){
            employee.setEndDate(endDate);
            System.out.println("Employee "+ employee.getName()+ " contract end date now is: "+employee.getEndDate());
        }
    }
    public void updateRetirementDate(int id,Date retirementDate){
        Employee employee=findEmployeeById(id);
        if(employee!=null){
            employee.setRetirementDate(retirementDate);
            System.out.println("Employee:"+ employee.getName()+" new retirement date is");
        }
    }


}
