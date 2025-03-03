import java.util.*;

public class Main {
    public static void main(String[] args) {
        inputRandomOrder();
    }
    public static void inputRandomOrder() {
        Scanner scanner = new Scanner(System.in);
        String[] types = {"integer", "double", "boolean", "char", "String"};
        String[] results = new String[types.length];
        List<String> typeList = new ArrayList<>(Arrays.asList(types));
        Collections.shuffle(typeList);

        for (String currentType : typeList) {
            switch (currentType) {
                case "integer":
                    System.out.print("Integer: ");
                    int intValue = scanner.nextInt();
                    results[typeList.indexOf(currentType)] = String.valueOf(intValue);
                    break;

                case "double":
                    System.out.print("Double: ");
                    double doubleValue = scanner.nextDouble();
                    results[typeList.indexOf(currentType)] = String.valueOf(doubleValue);
                    break;

                case "boolean":
                    System.out.print("Boolean: ");
                    boolean booleanValue = scanner.nextBoolean();
                    results[typeList.indexOf(currentType)] = String.valueOf(booleanValue);
                    break;

                case "char":
                    System.out.print("Char: ");
                    char charValue = scanner.next().charAt(0);
                    results[typeList.indexOf(currentType)] = String.valueOf(charValue);
                    break;

                case "String":
                    System.out.print("String: ");
                    String stringValue = scanner.next();
                    results[typeList.indexOf(currentType)] = stringValue;
                    break;
            }
        }

        scanner.close();
        System.out.println("\n\n\nOutput->>");
        for (String currentType : typeList) {
            System.out.println("\t" +currentType + ": " + results[typeList.indexOf(currentType)]);
        }
    }
}
