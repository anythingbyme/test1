package io;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public final class IOUtil {

    public static final String PATH_EMPTY = "Path is empty";
    public static final String FILE_NOT_EXISTS = "File not exists";

    private IOUtil() {
    }

    public static String readFile(String path) throws IOException{
        if (path == null || path.equals("")) {
            throw new RuntimeException(PATH_EMPTY);
        }

        //FILE not exists
        if(!isExists(path)) {
            throw new RuntimeException(FILE_NOT_EXISTS);
        }

        StringBuilder sb  = new StringBuilder();
//        try(BufferedReader br = new BufferedReader(new FileReader(Path.of(path).toFile()))) {
        try(BufferedReader br = Files.newBufferedReader(Path.of(path))) {
            while (br.readLine() != null) {
                sb.append(br.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
//        return String.join(" ", Files.readAllLines(Path.of(path)));
    }

    private static boolean isExists(String path) {
        return Files.exists(Path.of(path));
    }

    private static boolean createFile(Path path) {
        try {
            Files.createFile(path);
        } catch (IOException e) {
            System.out.println("Unable to create file: " + path.toString());
            return false;
        }
        return true;
    }

    private static boolean createDir(Path path) {
        try {
            Files.createDirectories(path);
        } catch (IOException e) {
            System.out.println("Unable to create dir: " + path.toString());
            return false;
        }
        return true;
    }
}
