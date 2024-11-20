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
 
// 输入具体数据以及输出
public class AssimentOne {
    public static void main(String[] args) {
        // 对3个全科医生对象进行赋值
        GeneralPractitioner Docter1 = new GeneralPractitioner(1, "Sun Ningkun", "Emergency physician", " General Practitioner", "To help patients quickly diagnose what kind of disease is it");
        GeneralPractitioner Docter2 = new GeneralPractitioner(2, "Yang Fengrui", "Department of stomatology", " General Practitioner", "");
        GeneralPractitioner Docter3 = new GeneralPractitioner(3, "Meng Qingxuan", "Department of orthopaedics", " General Practitioner", "");
 
        // 创建2个其他医生对象
        Othertype other1 = new Othertype(4, "Wang Xu", "Nurse", "Other type", "Take care of the sick");
        Othertype other2 = new Othertype(5, "Sun Chongbo", "dispenser", "Other type", "Fill medicine for a patient");
 
        // 将对象添加到列表中来进行遍历
        HealthProfessional[] doctors = {Docter1, Docter2, Docter3, other1, other2};
 
        // 遍历并打印每个医生的详细信息
        for (HealthProfessional doctor : doctors) {
            doctor.printDetails();
            System.out.println("-----");
        }
    }
}
