package p000;

import android.webkit.MimeTypeMap;
import com.reactnativecommunity.clipboard.ClipboardModule;
import java.util.Map;

/* renamed from: Wr0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8492Wr0 {

    /* renamed from: a */
    public static final MimeTypeMap f13420a = MimeTypeMap.getSingleton();

    /* renamed from: b */
    public static final Map f13421b;

    static {
        C1380Vw.m8641b(ClipboardModule.MIMETYPE_HEIF, "heif", ClipboardModule.MIMETYPE_HEIC, "heic");
        f13421b = C1380Vw.m8641b("heif", ClipboardModule.MIMETYPE_HEIF, "heic", ClipboardModule.MIMETYPE_HEIC);
    }
}
