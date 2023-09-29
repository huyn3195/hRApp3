import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

class Employee{
    private final Date birthdate;
    private int id;
    private String name;
    private double salary;
    private int attendance;
    private int leaveAllowance;
    private int identification;
    private final String gender;
    private final String nationality;
    private String insurance;
    private String workingStatus;
    private String grantPlace;
    private Date grantDate;
    private String birthplace;
    private String location;
    private String literacylevel;
    private String educationLevel;
    private String position;
    private String seniority;
    private int monthWithoutPay;
    private String contractType;
    private final Date startDate;
    private Date endDate;
    private String department;
    private int monthsForNextPayRaise;
    private int overtimeHoursAnnually;
    private int overtimeHourseMonthly;
    private String training;
    private String disciplinary;
    private String work_relatedDiseases;
    private String accident;
    private Date retirementDate;
    private String Vet;
    private String note;






    public Employee(int id, String name, double salary, int identification, Date birthdate, String birthplace, String gender, String nationality, String insurance, String workingStatus, String grantPlace, String location, String educationLevel, String literacylevel, String position, String seniority, Date grantDate, String contractType, int monthWithoutPay, Date startDate,Date endDate,int monthsForNextPayRaise,int overtimeHourseMonthly,int overtimeHoursAnnually, String training, String disciplinary, String work_relatedDiseases, String accident, Date retirementDate, String Vet, String note, String department,int leaveAllowance){
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.identification=identification;
        this.birthdate=birthdate;
        attendance=0;
        this.leaveAllowance=leaveAllowance;
        this.gender=gender;
        this.nationality=nationality;
        this. insurance=insurance;
        this.department=department;
        this.Vet=Vet;
        this.note=note;
        this.retirementDate=retirementDate;
        this.workingStatus=workingStatus;
        this.work_relatedDiseases=work_relatedDiseases;
        this.disciplinary=disciplinary;
        this.accident=accident;
        this.training=training;
        this.grantPlace=grantPlace;
        this.literacylevel=literacylevel;
        this.location=location;
        this.overtimeHoursAnnually=overtimeHoursAnnually;
        this.overtimeHourseMonthly=overtimeHourseMonthly;
        this.monthWithoutPay=monthWithoutPay;
        this.position=position;
        this.monthsForNextPayRaise=monthsForNextPayRaise;
        this.startDate=startDate;
        this.endDate=endDate;
        this.contractType=contractType;
        this.grantDate=grantDate;
        this.educationLevel=educationLevel;
        this.seniority=seniority;
        this.birthplace=birthplace;



    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }


    public String getWorkingStatus(){
        return workingStatus;
    }
    public void setWorkingStatus(String newWorkingStatus){
        this.workingStatus=newWorkingStatus;
    }
    public String getPosition(){
        return position;
    }
    public void setPosition(String newPosition){
        this.position=newPosition;
    }
    public String getSeniority(){
        return seniority;
    }
    public void setSeniority(String newSeniority){
        this.seniority=newSeniority;
    }
    public int getMonthWithoutPay(){
        return monthWithoutPay;
    }
    public void setContractType(String newContractType){
        this.contractType=newContractType;
    }
    public String getContractType(){
        return contractType;
    }
    public Date getStartDate(){
        return startDate;
    }
    public Date getEndDate(){
        return endDate;
    }
    public Date getRetirementDate(){
        return retirementDate;
    }
    public void setRetirementDate(Date newretirementDate){
        this.retirementDate=newretirementDate;
    }
    public String getDepartment(){
        return department;
    }
    public void setDepartment(String newDepartment){
        this.department=newDepartment;
    }
    public int getMonthsForNextPayRaise(){
        return monthsForNextPayRaise;
    }
    public int getOvertimeHoursAnnually(){
        return overtimeHoursAnnually;
    }
    public void setOvertimeHoursAnnually(int annually){
        this.overtimeHoursAnnually=annually;
    }
    public int getOvertimeHourseMonthly(){
        return overtimeHourseMonthly;
    }
    public void setOvertimeHourseMonthly(int monthly){
        this.overtimeHourseMonthly=monthly;
    }

    public String getTraining(){
        return training;
    }
    public void setTraining(String newTraining){
        this.training=newTraining;
    }
    public String getDisciplinary(){
        return disciplinary;
    }
    public void setDisciplinary(String newDisciplinary){
        this.disciplinary=newDisciplinary;
    }
    public String getAccident(){
        return accident;
    }
    public void setAccident(String newAccident){
        this.accident=newAccident;
    }
    public String getWork_relatedDiseases(){
        return work_relatedDiseases;
    }
    public void setWork_relatedDiseases(String newDiseases){
        this.work_relatedDiseases=newDiseases;
    }
    public void setEndDate(Date newEndDate){
        this.endDate=newEndDate;
    }
    public String getNote(){
        return note;
    }
    public void setNote(String newNote){
        this.note=newNote;

    }
    public void updatedLeaveAllowance(){
        leaveAllowance--;
    }
    public void increaseLeaveAllowance(){
        leaveAllowance=leaveAllowance+1;
    }
    public void setLeaveAllowance(int newLeaveAllowance){
        this.leaveAllowance=newLeaveAllowance;
    }
    public void updatedAttendance(){
        attendance++;
    }
    public void increaseMonthWithoutPay(){
        monthWithoutPay++;
    }
    public void decreaseMonthWithoutPay(){
        monthWithoutPay--;
    }
    public void setSalary(double newSalary){
        this.salary=newSalary;
    }
    public void setMonthsForNextPayRaise(int newMonthsForNextPayRaise){
        this.monthsForNextPayRaise=newMonthsForNextPayRaise;
    }
    public void updateMonthsForNextPayRaise(){
        monthsForNextPayRaise--;
    }
    public String getEmployee(){
        return "Employee name: "+ name +" id: "+id+" National identification number: "+identification+" grant date: "+grantDate+" grant place: "+grantPlace+" birth place: "+birthplace+" Date of Birth: "+birthdate+" gender: "+gender+" nationality: "+nationality+" current location: "+location+" contract type: "+contractType+"contract start date: "+startDate+" contract end date: "+endDate+" insurance number: "+insurance+" salary: "+salary+" attendance this month: "+ attendance +" leave allowance left this month: "+leaveAllowance +" months left until payraise: "+monthsForNextPayRaise+" months without pay: "+monthWithoutPay+" overtime hours annually: "+overtimeHoursAnnually+" overtime hours monthly: "+overtimeHourseMonthly+" education: "+educationLevel+" cấp bậc học: "+literacylevel+" working status: "+workingStatus+" job: "+position+" position: "+seniority+" training: "+ training+" discplinary: "+disciplinary+" work-related disease: "+work_relatedDiseases+" working accident: "+accident+" veteran: "+Vet+" notice: "+ note;
    }


    public double getSalary() {
        return salary;
    }

    public int getIdentification() {
        return identification;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public String getBirthplace() {
        return birthplace;
    }

    public String getGender() {
        return gender;
    }

    public String getNationality() {
        return nationality;
    }

    public String getInsurance() {
        return insurance;
    }

    public String getGrantPlace() {
        return grantPlace;
    }

    public String getLocation() {
        return location;
    }

    public String getEducationLevel() {
        return educationLevel;
    }
    public String getLiteracylevel(){
        return literacylevel;
    }
    public String getVet(){
        return Vet;
    }

    public Date getGrantDate() {
        return grantDate;
    }

    public int getLeaveAllowance() {
        return leaveAllowance;
    }
}
public class Main {
    public static void main(String[] args) {

        HRapp hrApp = new HRapp();
        Scanner scan = new Scanner(System.in);
        hrApp.loadEmployees();

        while (true) {
            System.out.println("HR App Menu:");
            System.out.println("1. Add Employee");
            System.out.println("2. Update Employee Attendance");
            System.out.println("3.Update Leave Allowance");
            System.out.println("4.View employee months left untill next payraise. Update current salary and months left till next payraise");
            System.out.println("5.Update employee months withoutpay");
            System.out.println("6.Update employee information");
            System.out.println("7. Print Employee Details");
            System.out.println("8. Remove Employee");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");

            int choice = scan.nextInt();
            scan.nextLine();
            switch(choice){
                case 1:
                    System.out.println("Enter Employee Id:");
                    int id = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Enter Employee name:");
                    String name=scan.nextLine();
                    System.out.println("Enter employee salary:");
                    double salary= scan.nextDouble();
                    scan.nextLine();
                    System.out.println("Enter employee identification number:");
                    int identification=scan.nextInt();
                    scan.nextLine();
                    System.out.println("Enter employee leave allowance:");
                    int leaveAllowance= scan.nextInt();
                    scan.nextLine();
                    System.out.println("Enter employee birthplace:");
                    String birthplace=scan.nextLine();
                    System.out.println("Enter employee gender:(Male/Female/Other)");
                    String gender=scan.nextLine();
                    System.out.println("Enter employee nationality:");
                    String nationality=scan.nextLine();
                    System.out.println("Enter employee insurance number");
                    String insurance=scan.nextLine();
                    System.out.println("Enter employee working status:(remote/on site)");
                    String workingStatus=scan.nextLine();
                    System.out.println("Enter identification grant place:");
                    String grantPlace=scan.nextLine();
                    System.out.println("Enter current location:");
                    String location= scan.nextLine();
                    System.out.println("Enter employee education level");
                    String educationLevel=scan.nextLine();
                    System.out.println("Enter employee litercy level");
                    String literacylevel=scan.nextLine();
                    System.out.println("Enter employee current job");
                    String position=scan.nextLine();
                    System.out.println("Enter employee current position in the company:");
                    String seniority=scan.nextLine();
                    System.out.println("Enter employee identification granted date (dd/MM/yyyy):");
                    String grantDateStr=scan.nextLine();
                    Date grantDate=null;
                    try{
                        grantDate=new SimpleDateFormat("dd/MM/yyyy").parse(grantDateStr);
                    }catch(Exception e){
                        System.out.println("Invalid date format.Please try again");
                        continue;
                    }
                    System.out.println("Enter employee contract type:");
                    String contractType= scan.nextLine();
                    System.out.println("Enter employee month without pay");
                    int monthWithoutPay=scan.nextInt();
                    scan.nextLine();
                    System.out.println("Enter employee contract start date(dd/MM/yyyy):");
                    String startDateStr=scan.nextLine();
                    Date startDate=null;
                    try{
                        startDate=new SimpleDateFormat("dd/MM/yyyy").parse(startDateStr);
                    } catch(Exception e){
                        System.out.println("Invalid date format. Try again");
                        continue;
                    }
                    System.out.println("Enter employee contract end date(dd/MM/yyyy):");
                    String endDateStr=scan.nextLine();
                    Date endDate=null;
                    try{
                        endDate=new SimpleDateFormat("dd/MM/yyyy").parse(endDateStr);
                    } catch(Exception e){
                        System.out.println("Invalid date format. Try again");
                        continue;
                    }
                    System.out.println("Enter months untill next payraise");
                    int monthsForNextPayraise= scan.nextInt();
                    scan.nextLine();
                    System.out.println("Enter employee overtime hours in this month:");
                    int overtimeHourseMonthly=scan.nextInt();
                    scan.nextLine();
                    System.out.println("Enter employee overtime hours in this year:");
                    int overtimeHoursAnnually= scan.nextInt();
                    scan.nextLine();
                    System.out.println("Enter employee training experience:");
                    String training=scan.nextLine();
                    System.out.println("Enter employee disciplinary history:");
                    String disciplinary=scan.nextLine();
                    System.out.println("Has this employee suffered from any work-related diseases? If yes then type in the type. If no just type no");
                    String work_relatedDiseases=scan.nextLine();
                    System.out.println("Has this employee suffered from any accident? If yes then type in the type. If no just type no");
                    String accident=scan.nextLine();
                    System.out.println("Enter the retirement date for this employee(dd/MM/yyyy)");
                    String retirementDateStr=scan.nextLine();
                    Date retirementDate=null;
                    try{
                        retirementDate=new SimpleDateFormat("dd/MM/yyyy").parse(retirementDateStr);
                    }catch(Exception e){
                        System.out.println("Invalid date format. Please try again");
                        continue;
                    }
                    System.out.println("Is this employee a veteran?:");
                    String Vet=scan.nextLine();
                    System.out.println("Enter the department for this employee");
                    String department=scan.nextLine();
                    System.out.println("Notes for this employee");
                    String note=scan.nextLine();
                    System.out.println("Enter employee birthday(dd/MM/yyyy):");
                    String birthdateStr=scan.nextLine();
                    Date birthdate=null;
                    try {
                        birthdate = new SimpleDateFormat("dd/MM/yyyy").parse(birthdateStr);
                    } catch (Exception e) {
                        System.out.println("Invalid date format. Please try again.");
                        continue;
                    }
                    Employee employee = new Employee(id, name, salary, identification, birthdate, birthplace, gender,
                            nationality, insurance, workingStatus, grantPlace, location, educationLevel, literacylevel,
                            position, seniority, grantDate, contractType, monthWithoutPay, startDate, endDate,
                            monthsForNextPayraise, overtimeHourseMonthly, overtimeHoursAnnually, training, disciplinary,
                            work_relatedDiseases, accident, retirementDate, Vet, note, department, leaveAllowance);
                    hrApp.insertEmployees(employee);
                    // Insert employee data into the database
                    System.out.println("Added new employee successfully");
                    break;
                case 2:
                    System.out.println("Enter employee id:");
                    id= scan.nextInt();
                    hrApp.updateEmployeeAttendance(id);
                    break;
                case 3:
                    System.out.println("Enter employee id:");
                    id= scan.nextInt();
                    if(hrApp.employeeChecker(id)==true) {
                        System.out.println("Enter your choice.1 Reset employee leave allowance. 2 Increase employee leave allowance. 3 Decrease employee leave allowance");
                        int choice1 = scan.nextInt();
                        switch (choice1) {
                            case 1:
                                System.out.println("Enter employee new leave allowance");
                                int newLeaveAllowance = scan.nextInt();
                                hrApp.resetLeaveAllowance(id, newLeaveAllowance);
                                break;
                            case 2:
                                hrApp.increaseEmployeeLeaveAllowance(id);
                                break;
                            case 3:
                                hrApp.updateEmployeeLeaveAllowance(id);
                                break;
                            default:
                                System.out.println("Invalid choice");
                        }
                    }

                    break;
                case 4:
                    System.out.println("Enter employee id");
                    id=scan.nextInt();
                    if(hrApp.employeeChecker(id)) {
                        System.out.println("Enter your choice:1. View current months left untill next payraise. 2.Update current months left until next payraise. 3. Update Salary");
                        int choice2 = scan.nextInt();
                        switch (choice2) {
                            case 1:
                                hrApp.viewMonthsLeftForNextPayRaise(id);
                                break;
                            case 2:
                                hrApp.updateMonthsForNextPayRaise(id);
                                break;
                            case 3:
                                System.out.println("Enter a new salary:");
                                double newSalary = scan.nextDouble();
                                System.out.println("Enter new months for next payraise:");
                                int months = scan.nextInt();
                                hrApp.updateSalary(id, months, newSalary);
                                break;
                            default:
                                System.out.println("Invalid choice:");
                        }
                    }
                    break;
                case 5:
                    System.out.println("Enter employee id:");
                    id= scan.nextInt();
                    if(hrApp.employeeChecker(id)){
                        System.out.println("Enter your choice: 1.Increase months without pay 2.Decrease months without pay 3. View months without pay");
                        int choice3= scan.nextInt();
                        switch(choice3){
                            case 1:
                                hrApp.increaseEmployeeMonthWithoutPay(id);
                                break;
                            case 2:
                                hrApp.decreaseEmployeeWithoutPay(id);
                                break;
                            case 3:
                                hrApp.viewEmployeeWithoutPay(id);
                            default:
                                System.out.println("Invalid");
                        }

                    }
                    break;
                case 6:
                    System.out.println("Enter employee id:");
                    id= scan.nextInt();
                    if(hrApp.employeeChecker(id)){
                        System.out.println("Enter your choice: 1.Update Contract Type 2.Update Working Status 3.Update Job 4.Update Position 5.Update Working Department 6.Update Employee Training 7.Update Employee Accident 8.Update Work Related Diseases 9.Update Disciplinary History 10.Update Overtime Hours Monthly 11.Update Overtime Hours Annually 12.Update Contract End Date 13.Update Retirement Date 14.Update Note");
                        int choice4= scan.nextInt();
                        scan.nextLine();
                        switch (choice4){
                            case 1:
                                System.out.println("Enter new contract type");
                                contractType=scan.nextLine();
                                hrApp.updateEmployeeContractType(id,contractType);
                                break;
                            case 2:
                                System.out.println("Enter new working status");
                                workingStatus=scan.nextLine();
                                hrApp.updateEmployeeContractType(id,workingStatus);
                                break;
                            case 3:
                                System.out.println("Enter employee's job");
                                position=scan.nextLine();
                                hrApp.updatePosition(id,position);
                                break;
                            case 4:
                                System.out.println("Enter employee's position");
                                seniority=scan.nextLine();
                                hrApp.updateSeniority(id,seniority);
                                break;
                            case 5:
                                System.out.println("Enter employee new department");
                                department=scan.nextLine();
                                hrApp.updateDepartment(id,department);
                                break;
                            case 6:
                                System.out.println("Enter employee new training experience");
                                training=scan.nextLine();
                                hrApp.updateTraining(id,training);
                                break;
                            case 7:
                                System.out.println("Enter accident");
                                accident=scan.nextLine();
                                hrApp.updateAccident(id,accident);
                                break;
                            case 8:
                                System.out.println("Enter diseases type:");
                                work_relatedDiseases=scan.nextLine();
                                hrApp.updateDiseases(id,work_relatedDiseases);
                                break;
                            case 9:
                                System.out.println("Enter discipline actions:");
                                disciplinary=scan.nextLine();
                                hrApp.updateDisciplinary(id,disciplinary);
                                break;
                            case 10:
                                System.out.println("Enter employee overtime hours this month");
                                overtimeHourseMonthly= scan.nextInt();
                                scan.nextLine();
                                hrApp.updateOvertimeMonthly(id,overtimeHourseMonthly);
                                break;
                            case 11:
                                System.out.println("Enter employee overtime hours this year");
                                overtimeHoursAnnually= scan.nextInt();
                                scan.nextLine();
                                hrApp.updateOvertimeAnnually(id,overtimeHoursAnnually);
                                break;
                            case 12:
                                System.out.println("Enter employee new contract end date (dd/mm/yyyy)");
                                scan.nextLine();
                                endDateStr=scan.nextLine();
                                endDate=null;
                                try{
                                    endDate=new SimpleDateFormat("dd/mm/yyyy").parse(endDateStr);
                                }
                                catch(Exception e){
                                    System.out.println("Invalid format:");
                                    continue;
                                }
                                hrApp.updateEndDate(id,endDate);
                                break;
                            case 13:
                                System.out.println("Enter new retirement date");
                                scan.nextLine();
                                retirementDateStr=scan.nextLine();
                                retirementDate=null;
                                try{
                                    retirementDate=new SimpleDateFormat("dd/mm/yyyy").parse(retirementDateStr);
                                }catch(Exception e){
                                    System.out.println("Invalid format");
                                    continue;
                                }
                                hrApp.updateRetirementDate(id,retirementDate);
                                break;
                            case 14:
                                System.out.println("Enter note for employee");
                                note=scan.nextLine();
                                hrApp.updateNote(id,note);
                                break;
                            default:
                                System.out.println("Invalid choice");
                        }
                    }

                case 7:
                    System.out.println("Enter employee id:");
                    id= scan.nextInt();
                    hrApp.printEmployeeDetails(id);
                    break;
                case 8:
                    System.out.println("Enter employee id:");
                    id=scan.nextInt();
                    hrApp.deleteEmployeeById(id);
                    hrApp.removeEmployee(id);
                    break;
                case 9:
                    hrApp.saveEmployees();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
            System.out.println("Do you want to continue? 1: Yes, 2:No");
            int choice2= scan.nextInt();
            scan.nextLine();
            if(choice2==2){
                System.exit(0);
            }
        }

    }

}
