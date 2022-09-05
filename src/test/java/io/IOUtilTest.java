package io;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static io.IOUtil.FILE_NOT_EXISTS;
import static io.IOUtil.PATH_EMPTY;

class IOUtilTest {

    @Test
    void readFile_empty_path() {
        Throwable ex = Assertions.assertThrows(RuntimeException.class, ()->IOUtil.readFile(""));
        Assertions.assertEquals(PATH_EMPTY, ex.getMessage());
    }

    @Test
    void readFile_file_not_exists() {
        Throwable ex = Assertions.assertThrows(RuntimeException.class, ()->IOUtil.readFile("/test/test.txt"));
        Assertions.assertEquals(FILE_NOT_EXISTS, ex.getMessage());
    }

    @Test
    void readFile() throws IOException {
        String path = "C:\\test\\test.txt";
        Assertions.assertEquals("Test", IOUtil.readFile(path));
    }
}