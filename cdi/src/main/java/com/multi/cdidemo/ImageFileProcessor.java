package com.multi.cdidemo;


import com.multi.cdidemo.customqualifers.PngFileEditorQualifier;
import com.multi.cdidemo.imageprocessing.ImageFileEditor;
import com.multi.cdidemo.timeformatter.TimeFormatter;

import javax.inject.Inject;
import javax.inject.Named;


public class ImageFileProcessor {

/*    @Inject
    @Named("PngFileEditor")*/
    private ImageFileEditor imageFileEditor;
    private TimeFormatter timeFormatter;

    @Inject
    public ImageFileProcessor(@PngFileEditorQualifier ImageFileEditor imageFileEditor,
            TimeFormatter timeFormatter) {
        this.imageFileEditor = imageFileEditor;
        this.timeFormatter = timeFormatter;
    }

/*    @Inject
    public void setImageFileEditor(@Named("GifFileEditor") ImageFileEditor imageFileEditor) {
        this.imageFileEditor = imageFileEditor;
    }*/

    public String openFile(String fileName) {
        return imageFileEditor.openFile(fileName) + " at: " + timeFormatter.getTime();
    }


    public String editFile(String fileName) {
        return imageFileEditor.editFile(fileName);
    }


    public String writeFile(String fileName) {
        return imageFileEditor.writeFile(fileName);
    }


    public String saveFile(String fileName) {
        return imageFileEditor.saveFile(fileName);
    }
}
