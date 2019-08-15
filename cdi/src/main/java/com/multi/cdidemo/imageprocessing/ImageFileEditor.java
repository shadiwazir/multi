package com.multi.cdidemo.imageprocessing;

public interface ImageFileEditor {
    String openFile(String fileName);
    String editFile(String fileName);
    String writeFile(String fileName);
    String saveFile(String fileName);
}
