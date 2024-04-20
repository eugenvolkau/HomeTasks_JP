package com.telran.prof.hometask.inOutPut15042024;

import javax.management.timer.Timer;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class CreateFile {

    public static void main(String[] args) throws InterruptedException {
        String path = "C:\\Users\\eugen\\JAVA_PRO\\JavaHTask\\homeTasks\\src\\main" +
                "\\java\\com\\telran\\prof\\hometask\\inOutPut15042024\\workOut.txt";
        String str = ("This is my first experience when I myself" +
                " \n workwith IO API. I can do everything!");
        try {
            FileOutputStream outFile = new FileOutputStream(path);
            byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
            for (byte unit : bytes) {
                outFile.write(bytes);
                outFile.close();
            }
        } catch (FileNotFoundException exception) {
            System.out.println("Incorrect file path. Try agayn");
        } catch (Exception exception) {
            System.out.println("Error to file accsess. Try agayn");
        }
        // Delete a file.
        File fileToDelete = new File(path);
        if (fileToDelete.exists()) {
            boolean delete = fileToDelete.delete();
            System.out.println("The file war deletet?   " + delete);
        }
// Create new Dir(mkDir)
        String pathToDir = "C:\\Users\\eugen\\JAVA_PRO\\JavaHTask\\homeTasks" +
                "\\src\\main\\java\\com\\telran\\prof\\hometask\\inOutPut15042024\\DirecTorry";
        File direcTorry = new File(pathToDir);
        System.out.println("New directory is exists " + direcTorry.exists());
        boolean mkDir = direcTorry.mkdir();
        System.out.println("New directory is exists " + direcTorry.exists());


        File direcTorry1 = new File(pathToDir);
        try {
            eraseDir(direcTorry1);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //Delete Dir.

    public static void eraseDir(File nameOfDir) throws IOException {
        if (nameOfDir.isDirectory()) {
            for (File file : nameOfDir.listFiles()) {
                eraseDir(file);
            }
        }
        if (!nameOfDir.delete()) {
            throw new IOException("File cannot be deleted: " + nameOfDir);
        }
    }
}
// 1 уровень сложности: 1. Создайте файл, используя FileOutputStream, с текстом:
// "This is my first experience when I myself work with IO API. I can do everything!"
//Создайте файл используя new File() в каталоге Desktop, убедитесь,
// что файл существует, удалите файл.
//  Создайте метод для удаления директории и суб-директорий
// Не обязательная : Для игры в города из прошлой домашки на Set,
// сделайте опцию, чтобы можно было выбрать сохранение в течении игры и
// сохранить состояние введенных городов в файл. При старте программы,
// если файл сохранения существует, предлагать продолжить или начать новую игру.


