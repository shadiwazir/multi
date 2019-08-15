package com.multi.cdidemo.imageprocessing;

import com.multi.cdidemo.customqualifers.PngFileEditorQualifier;

import javax.enterprise.inject.Default;
import javax.inject.Named;

//@Default
@Named("PngFileEditor")
@PngFileEditorQualifier
public class PngFileEditor implements ImageFileEditor {
    @Override
    public String openFile(String fileName) {
        return "Opening Png file " + fileName;
    }

    @Override
    public String editFile(String fileName) {
        return "Editing Png file " + fileName;
    }

    @Override
    public String writeFile(String fileName) {
        return "Writing Png file " + fileName;
    }

    @Override
    public String saveFile(String fileName) {
        return "Saving Png file " + fileName;
    }
}
