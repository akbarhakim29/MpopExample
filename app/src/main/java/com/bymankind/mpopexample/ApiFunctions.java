package com.bymankind.mpopexample;

import com.starmicronics.starioextension.ICommandBuilder;
import com.starmicronics.starioextension.StarIoExt;

/**
 * Created by Server-Panduit on 1/5/2018.
 */

public class ApiFunctions {
    public static byte[] createGenericData(StarIoExt.Emulation emulation) {
        byte[] data = "Hello World.".getBytes();

        ICommandBuilder builder = StarIoExt.createCommandBuilder(emulation);

        builder.beginDocument();

        builder.appendFontStyle(ICommandBuilder.FontStyleType.A);
        builder.append(data);
        builder.append((byte) 0x0a);

        builder.appendCutPaper(ICommandBuilder.CutPaperAction.PartialCutWithFeed);

        builder.endDocument();

        return builder.getCommands();
    }
}
