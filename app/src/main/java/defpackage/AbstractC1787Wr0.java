package defpackage;

import android.webkit.MimeTypeMap;
import com.reactnativecommunity.clipboard.ClipboardModule;
import java.util.Map;

/* renamed from: Wr0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1787Wr0 {
    public static final MimeTypeMap a = MimeTypeMap.getSingleton();
    public static final Map b;

    static {
        C1723Vw.b(ClipboardModule.MIMETYPE_HEIF, "heif", ClipboardModule.MIMETYPE_HEIC, "heic");
        b = C1723Vw.b("heif", ClipboardModule.MIMETYPE_HEIF, "heic", ClipboardModule.MIMETYPE_HEIC);
    }
}
