package org.esa.s2tbx.gdal.writer.plugins;

/**
 * Writer plugin for products using the GDAL library.
 *
 * @author Jean Coravu
 */
public class PNMDriverProductWriterPlugIn extends AbstractDriverProductWriterPlugIn {

    public PNMDriverProductWriterPlugIn() {
        super(".pnm", "PNM", "Portable Pixmap Format", "Byte UInt16");
    }
}