import java.util.ArrayList;
import java.util.List;
// HealthProfessional 类定义
class HealthProfessional {
    private int id; 
    private String name; 
    private String message; 
 
    // 默认构造函数
    public HealthProfessional() {
    }
 
    // 第二个构造函数，用于初始化所有的实例变量
    public HealthProfessional(int id, String name, String message) {
        this.id = id;
        this.name = name;
        this.message = message;
    }
 
    // Getter 和 Setter 方法
    public int getId() {
        return id;
    }
 
    public void setId(int id) {
        this.id = id;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public String getMessage() {
        return message;
    }
 
    public void setMessage(String message) {
        this.message = message;
    }
 
    // 打印所有实例变量的方法
    public void printDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Message: " + message);
    }
}
 
// GeneralPractitioner 子类
class GeneralPractitioner extends HealthProfessional {
    private String type;
    private String strongPoint;
 
    // 构造函数
    public GeneralPractitioner(int id, String name, String message, String type, String strongPoint) {
        super(id, name, message);
        this.type = type;
        this.strongPoint = strongPoint;
    }
 
    // Getter 和 Setter 方法
    public String getType() {
        return type;
    }
 
    public void setType(String type) {
        this.type = type;
    }
 
    public String getStrongPoint() {
        return strongPoint;
    }
 
    public void setStrongPoint(String strongPoint) {
        this.strongPoint = strongPoint;
    }
 
    // 打印所有实例变量的方法（包括父类的）
    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Type: " + type);
        System.out.println("Strong Point: " + strongPoint);
    }
}
 
// 创建Othertype子类，方法与上面的GeneralPractitioner子类一致，在这个子类中将不进行重复说明
class Othertype extends HealthProfessional {
    private String type;
    private String strongPoint;
 
    public Othertype(int id, String name, String message, String type, String strongPoint) {
        super(id, name, message);
        this.type = type;
        this.strongPoint = strongPoint;
    }
 
    public String getType() {
        return type;
    }
 
    public void setType(String type) {
        this.type = type;
    }
 
    public String getStrongPoint() {
        return strongPoint;
    }
 
    public void setStrongPoint(String strongPoint) {
        this.strongPoint = strongPoint;
    }
 
    // 打印所有实例变量的方法
    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Type: " + type);
        System.out.println("Strong Point: " + strongPoint);
    }
}
// Reservation类定义
class Reservation {
    private String patientName; 
    private String mobilePhoneNumber; 
    private String meetingDoctor; 
    private String time;
 
    // 默认构造函数
    public Reservation() {
    }
 
    // 第二个构造函数，用于初始化所有的实例变量
    public Reservation(String patientName, String mobilePhoneNumber, String meetingDoctor, String time ) {
        this.patientName = patientName;
        this.mobilePhoneNumber = mobilePhoneNumber;
        this.meetingDoctor = meetingDoctor;
        this.time = time;
    }
 
    // Getter 和 Setter 方法
    public String getpatientName() {
        return patientName;
    }
 
    public void setpatientName(String patientName) {
        this.patientName = patientName;
    }
 
    public String getmobilePhoneNumber() {
        return mobilePhoneNumber;
    }
 
    public void setmobilePhoneNumber(String mobilePhoneNumber) {
        this.mobilePhoneNumber = mobilePhoneNumber;
    }
 
    public String getmeetingDoctor() {
        return meetingDoctor;
    }
 
    public void setmeetingDoctor(String meetingDoctor) {
        this.meetingDoctor = meetingDoctor;
    }
    public String gettime() {
        return time;
    }
 
    public void settime(String time) {
        this.time = time;
    }
}


 
// HealthProfessional 类定义（保持不变）
// GeneralPractitioner 子类定义（保持不变）
// Othertype 子类定义（保持不变）
// Reservation 类定义（保持不变）
 
// 创建一个新的类来管理预约
class Appointment {
    private List<Reservation> appointments;
 
    public Appointment() {
        this.appointments = new ArrayList<>();
    }
 
    // 创建新的预约并将其添加到 ArrayList 中
    public void createAppointment(String patientName, String mobilePhoneNumber, HealthProfessional meetingDoctor, String time) {
        if (patientName == null || mobilePhoneNumber == null || meetingDoctor == null || time == null) {
            System.out.println("Unable to create an appointment");
            return;
        }
        Reservation reservation = new Reservation(patientName, mobilePhoneNumber, meetingDoctor.getName(), time);
        this.appointments.add(reservation);
    }
 
    // 显示 ArrayList 中现有的预约
    public void printExistingAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("No existing appointments");
        } else {
            for (Reservation reservation : appointments) {
                System.out.println("Patient name: " + reservation.getpatientName());
                System.out.println("Mobile phone number: " + reservation.getmobilePhoneNumber());
                System.out.println("Make a doctor's appointment: " + reservation.getmeetingDoctor());
                System.out.println("Appointment time: " + reservation.gettime());
                System.out.println("-----");
            }
        }
    }
 
    // 使用患者的手机取消预约
    public void cancelBooking(String mobilePhoneNumber) {
        boolean found = false;
        for (Reservation reservation : appointments) {
            if (reservation.getmobilePhoneNumber().equals(mobilePhoneNumber)) {
                appointments.remove(reservation);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("未找到该手机号码的预约。");
        }
    }
}
 
// 输入具体数据以及输出
public class AssimentOne {
    public static void main(String[] args) {
        // 对3个全科医生对象进行赋值
        GeneralPractitioner Docter1 = new GeneralPractitioner(1, "Sun Ningkun", "Emergency physician", " General Practitioner", "To help patients quickly diagnose what kind of disease is it");
        GeneralPractitioner Docter2 = new GeneralPractitioner(2, "Yang Fengrui", "Department of stomatology", " General Practitioner", "Treat patients with oral problems");
        GeneralPractitioner Docter3 = new GeneralPractitioner(3, "Meng Qingxuan", "Department of orthopaedics", " General Practitioner", "Treating patients for bone misalignment and other problems");
 
        // 对其他类型的医生进行赋值
        Othertype other1 = new Othertype(4, "Wang Xu", "Nurse", "Other type", "Take care of the sick");
        Othertype other2 = new Othertype(5, "Sun Chongbo", "dispenser", "Other type", "Fill medicine for a patient");
 
        // 将对象添加到列表中来进行遍历
        HealthProfessional[] doctors = {Docter1, Docter2, Docter3, other1, other2};
 
        // 遍历并打印每个医生的详细信息
        for (HealthProfessional doctor : doctors) {
            doctor.printDetails();
            System.out.println("-----");
        }
 
        // 创建 AppointmentManager 实例
        Appointment appointmentManager = new Appointment();
 
        // 预约两次全科医生
        appointmentManager.createAppointment("Mu Shaoqian", "111111111111", Docter1, "08:00");
        appointmentManager.createAppointment("Hu Haonan", "2222222222", Docter2, "10:00");
 
        // 再预约另外两位其他类型的健康专业人士
        appointmentManager.createAppointment("liu Haonan", "33333333333", other1, "12:00");
        appointmentManager.createAppointment("zhang Shijie", "44444444444", other2, "14:00");
 
        // 打印现有预约
        System.out.println("------------------------------");
        appointmentManager.printExistingAppointments();
 
        // 取消现有的预约之一
        appointmentManager.cancelBooking("0987654321");
 
        // 再次打印现有预约，以展示更新后的预约集合
        System.out.println("------------------------------");
        appointmentManager.printExistingAppointments();
    }
}
