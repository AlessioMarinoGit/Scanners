import java.util.Scanner;

class Scanners {
    public void run() {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            if (scanner.hasNextInt()) {
                int i = scanner.nextInt();
                System.out.println(i*3);
            } else {
                if (scanner.hasNextLine()) {
                    String str = scanner.next();
                    String[] splitCommas = str.split(",");
                    if (splitCommas.length != 0) {
                        for (int i = 0; i < splitCommas.length; i++) {
                        System.out.println(splitCommas[i]);
                        }
                    } else {
                        System.out.println(str);
                    }
                }
            }
        }
    }

    public static void main (String args[]) {
        Scanners Scanner = new Scanners();
        Scanner.run();
    }
}