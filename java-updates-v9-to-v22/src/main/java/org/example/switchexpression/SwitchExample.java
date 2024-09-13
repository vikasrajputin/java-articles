package org.example.switchexpression;

public class SwitchExample {
    public static void main(String[] args) {
        System.out.println("getOrderStatusOld :: "+getOrderStatusOld(1));
        System.out.println("getOrderStatusNew :: "+getOrderStatusNew(1));

        System.out.println("switchMulticaseOld :: "+switchMulticaseOld("SATURDAY"));
        System.out.println("switchMulticaseNew :: "+switchMulticaseNew("SATURDAY"));
    }

    public static String getOrderStatusOld(int statusCode) {
        String statusText = null;
        switch (statusCode) {
            case 1:
                statusText = "Pending";
                break;
            case 2:
                statusText = "Shipped";
                break;
            case 3:
                statusText = "Delivered";
                break;
            case 4:
                statusText = "Cancelled";
                break;
            default:
                statusText = "Unknown Status";
                break;
        }
        return statusText;
    }

    public static String getOrderStatusNew(int statusCode) {
        return switch (statusCode) {
            case 1 -> "Pending";
            case 2 -> "Shipped";
            case 3 -> "Delivered";
            case 4 -> "Cancelled";
            default -> "Unknown Status";
        };
    }

    public static String switchMulticaseOld(String day) {
            String dayType;

            switch (day) {
                case "MONDAY":
                case "TUESDAY":
                case "WEDNESDAY":
                case "THURSDAY":
                case "FRIDAY":
                    dayType = "Weekday";
                    break;
                case "SATURDAY":
                case "SUNDAY":
                    dayType = "Weekend";
                    break;
                default:
                    throw new IllegalArgumentException("Invalid day: " + day);
            }
            return dayType;
        }

        public static String switchMulticaseNew(String day) {
            String dayType = switch (day) {
                case "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY" -> "Weekday";
                case "SATURDAY", "SUNDAY" -> "Weekend";
                default -> throw new IllegalArgumentException("Invalid day");
            };
            return dayType;
        }
}
