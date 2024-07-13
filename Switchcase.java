public class Switchcase
{
    public static void main(String[] args) {
        char Attendance='P';
        switch(Attendance)
        {
            case 'A':
                System.out.println("ABSENT");
                break;
            case 'P':
                System.out.println("PRESENT");
                break;
            case 'O':
                System.out.println("On-Duty");
                break;
            default:
                System.out.println("INVALID");
        }
    }
}
