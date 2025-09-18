package defpackage;

import android.net.Uri;
import android.util.Base64;
import com.facebook.imagepipeline.image.EncodedImage;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class IC extends AbstractC0207Ck0 {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ IC(ExecutorService executorService, VH vh, int i) {
        super(executorService, vh);
        this.c = i;
    }

    @Override // defpackage.AbstractC0207Ck0
    public final EncodedImage d(C6589q70 c6589q70) {
        boolean zEquals;
        byte[] bytes;
        switch (this.c) {
            case 0:
                String string = c6589q70.b.toString();
                ML1.a(Boolean.valueOf(string.substring(0, 5).equals("data:")));
                int iIndexOf = string.indexOf(44);
                String strSubstring = string.substring(iIndexOf + 1, string.length());
                String strSubstring2 = string.substring(0, iIndexOf);
                if (strSubstring2.contains(";")) {
                    zEquals = strSubstring2.split(";")[r5.length - 1].equals("base64");
                } else {
                    zEquals = false;
                }
                if (zEquals) {
                    bytes = Base64.decode(strSubstring, 0);
                } else {
                    String strDecode = Uri.decode(strSubstring);
                    strDecode.getClass();
                    bytes = strDecode.getBytes();
                }
                return c(new ByteArrayInputStream(bytes), bytes.length);
            default:
                O90.f(c6589q70, "imageRequest");
                return c(new FileInputStream(c6589q70.b().toString()), (int) c6589q70.b().length());
        }
    }

    @Override // defpackage.AbstractC0207Ck0
    public final String e() {
        switch (this.c) {
            case 0:
                return "DataFetchProducer";
            default:
                return "LocalFileFetchProducer";
        }
    }
}
