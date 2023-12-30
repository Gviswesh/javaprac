import javax.swing.JOptionPane;

public class ipaddress {
    public static String validateIP(String ip) {
        String[] segments = ip.split("\\.");

        if (segments.length == 4) {
            for (String seg : segments) {
                if (seg.matches("\\d+") && (0 <= Integer.parseInt(seg) && Integer.parseInt(seg) <= 255)) {
                    // Valid segment
                } else {
                    return "Invalid";
                }
            }
        } else {
            return "Invalid";
        }

        return "Valid";
    }

    public static void main(String[] args) {
        System.out.println(validateIP("192.168.6.6"));
        // String ip=JOptionPane.showInputDialog(null, "Enter the IP address");
        // validateIP(ip);
    }
}
