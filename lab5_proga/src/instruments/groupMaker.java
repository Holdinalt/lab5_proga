package instruments;

import source.Coordinates;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class groupMaker {

    private Scanner scanner;
    private boolean fileMod;

    public groupMaker(){
        this.scanner = new Scanner(System.in);
    }

    public void setFileMod() {
        this.fileMod = true;
    }

    public void setConsoleMod() {
        this.fileMod = false;
    }

    /**
     * Entering not empty and null string from console or script
     * @param String
     * @see fileMod
     * @return String
     */
    public String makeNotEmptyString(String str) throws IncorrectScriptException {
        String name = "";
        while (true) {
            try {
                if (!(fileMod)) {
                    System.out.print(str);
                    name = scanner.nextLine().trim();
                } else {
                    // must be file mode
                }
                if (name.equals("")) throw new IncorrectDataException();
                break;

            } catch (IncorrectDataException e) {
                if (!(fileMod)) {
                    System.out.println("Строка не может быть пустой");
                } else {
                    throw new IncorrectScriptException();
                }
            } catch (NoSuchElementException e) {
                if (!(fileMod)) {
                    System.out.println("Строка не распознана");
                } else {
                    throw new IncorrectScriptException();
                }
            } catch (IllegalStateException e) {
                if (!(fileMod)) {
                    System.out.println("Непредвиденная ошибка");
                } else {
                    throw new IncorrectScriptException();
                }
            }

        }
        return name;
    }

    /**
     * Entering coordinates from console or script
     * @see fileMod
     * @return Coordinates
     */
    public Coordinates makeCoordinates() throws IncorrectScriptException {
        String[] coordinatesArray = new String[0];
        Integer minX = -138;
        Integer x;
        double y;
        while (true) {
            try {
                if (!(fileMod)) {
                    System.out.println("Формат ввода координатов - 'X Y', где X >" + (minX));
                    System.out.print("Введите координаты: ");
                    coordinatesArray = scanner.nextLine().trim().split(" ");
                } else {
                    // must be file mode
                }
                if ((!(Integer.parseInt(coordinatesArray[0]) > minX)) | (coordinatesArray.length != 2))
                    throw new IncorrectDataException();
                x = (Integer.parseInt(coordinatesArray[0]));
                y = (Double.parseDouble(coordinatesArray[1]));
                break;
            }
            catch (IncorrectDataException e) {
                if (!(fileMod)) {
                    System.out.println("Координата Х должна быть больше " + minX);
                } else {
                    throw new IncorrectScriptException();
                }
            }
            catch (NoSuchElementException e) {
                if (!(fileMod)) {
                    System.out.println("Координаты не распознаны");
                } else {
                    throw new IncorrectScriptException();
                }
            }
            catch (NumberFormatException e) {
                if (!(fileMod)) {
                    System.out.println("Координаты должны быть в числовом формате");
                } else {
                    throw new IncorrectScriptException();
                }
            }
            catch (NullPointerException | IllegalStateException e) {
                if (!(fileMod)) {
                    System.out.println("Непредвиденная ошибка");
                } else {
                    throw new IncorrectScriptException();
                }
            }
        }
        return new Coordinates(x, y);
    }

    /**
     * Entering long > 0 from console or script
     * @see fileMod
     * @return long
     */
    public long makeMoreZeroLongDigit(String str) throws IncorrectScriptException {
        long x = 0;
        while (true) {
            try {
                if (!(fileMod)) {
                    System.out.println(str);
                    x = Long.parseLong(scanner.nextLine().trim());
                } else {
                    // must be file mode
                }
                if (!(x > 0)) throw new IncorrectDataException();
                break;
            }
            catch (IncorrectDataException e) {
                if (!(fileMod)) {
                    System.out.println("Некорректное число");
                } else {
                    throw new IncorrectScriptException();
                }
            }
            catch (NoSuchElementException e) {
                if (!(fileMod)) {
                    System.out.println("Число не распознанно");
                } else {
                    throw new IncorrectScriptException();
                }
            }
            catch (NumberFormatException e) {
                if (!(fileMod)) {
                    System.out.println("Значение должно быть в числовом формате");
                } else {
                    throw new IncorrectScriptException();
                }
            }
            catch (NullPointerException | IllegalStateException e) {
                if (!(fileMod)) {
                    System.out.println("Непредвиденная ошибка");
                } else {
                    throw new IncorrectScriptException();
                }
            }
        }
        return x;
    }

    /**
     * Entering Integer > 0, can be null from console or script
     * @see fileMod
     * @return Integer
     */
    public Integer makeMoreZeroIntegerDigit(String str) throws IncorrectScriptException {
        Integer x = 0;
        while (true) {
            try {
                if (!(fileMod)) {
                    System.out.println(str);
                    x = Integer.parseInt(scanner.nextLine().trim());
                } else {
                    // must be file mode
                }
                if (!(x > 0)) throw new IncorrectDataException();
                break;
            }
            catch (IncorrectDataException e) {
                if (!(fileMod)) {
                    System.out.println("Некорректное число");
                } else {
                    throw new IncorrectScriptException();
                }
            }
            catch (NoSuchElementException e) {
                if (!(fileMod)) {
                    System.out.println("Число не распознанно");
                } else {
                    throw new IncorrectScriptException();
                }
            }
            catch (NumberFormatException e) {
                if (!(fileMod)) {
                    System.out.println("Значение должно быть в числовом формате");
                } else {
                    throw new IncorrectScriptException();
                }
            }
            catch (NullPointerException | IllegalStateException e) {
                if (!(fileMod)) {
                    System.out.println("Непредвиденная ошибка");
                } else {
                    throw new IncorrectScriptException();
                }
            }
        }
        return x;
    }


}
