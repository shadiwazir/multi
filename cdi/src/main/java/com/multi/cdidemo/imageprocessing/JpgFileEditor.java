package com.multi.cdidemo.imageprocessing;

import com.multi.cdidemo.customqualifers.GifFileEditorQualifier;
import com.multi.cdidemo.customqualifers.JpgFileEditorQualifier;

import javax.enterprise.inject.Alternative;
import javax.inject.Named;

//@Alternative
@Named("JpgFileEditor")
@JpgFileEditorQualifier
public class JpgFileEditor implements ImageFileEditor {
    @Override
    public String openFile(String fileName) {
        return "Opening Jpg file " + fileName;
    }

    @Override
    public String editFile(String fileName) {
        return "Editing Jpg file " + fileName;
    }

    @Override
    public String writeFile(String fileName) {
        return "Writing Jpg file " + fileName;
    }

    @Override
    public String saveFile(String fileName) {
        return "Saving Jpg file " + fileName;
    }
}
