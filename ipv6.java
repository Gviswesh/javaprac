public class ipv6 {
    public static String validIP(String ip) {
        String[] segments = ip.split("\\.");

        if (segments.length == 8) {
            for (String seg : segments) {
                if ((seg.matches("[0-9A-Fa-f]+") || seg.matches("[A-Za-z]+") || seg.matches("[0-9A-Za-z]+"))
                        && seg.length() == 4) {
                    for (char c : seg.toCharArray()) {
                        if (Character.isDigit(c) || (Character.isLetter(c) && Character.toUpperCase(c) <= 'F')) {
                            // Do nothing, continue
                        } else {
                            return "Invalid";
                        }
                    }
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
        String ip = "19F2.1A68.A256.FFFF.AF22.11DD.5AD1.887E";
        System.out.println(validIP(ip));
    }
}
