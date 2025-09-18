package p000;

import android.net.Uri;
import android.util.Base64;
import com.facebook.imagepipeline.image.EncodedImage;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.util.concurrent.ExecutorService;

/* renamed from: IC */
/* loaded from: classes.dex */
public final class C0517IC extends AbstractC7438Ck0 {

    /* renamed from: c */
    public final /* synthetic */ int f4838c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0517IC(ExecutorService executorService, C1339VH c1339vh, int i) {
        super(executorService, c1339vh);
        this.f4838c = i;
    }

    @Override // p000.AbstractC7438Ck0
    /* renamed from: d */
    public final EncodedImage mo1306d(C10737q70 c10737q70) {
        boolean zEquals;
        byte[] bytes;
        switch (this.f4838c) {
            case 0:
                String string = c10737q70.f40609b.toString();
                ML1.m5334a(Boolean.valueOf(string.substring(0, 5).equals("data:")));
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
                return m1305c(new ByteArrayInputStream(bytes), bytes.length);
            default:
                O90.m5968f(c10737q70, "imageRequest");
                return m1305c(new FileInputStream(c10737q70.m23932b().toString()), (int) c10737q70.m23932b().length());
        }
    }

    @Override // p000.AbstractC7438Ck0
    /* renamed from: e */
    public final String mo1307e() {
        switch (this.f4838c) {
            case 0:
                return "DataFetchProducer";
            default:
                return "LocalFileFetchProducer";
        }
    }
}
