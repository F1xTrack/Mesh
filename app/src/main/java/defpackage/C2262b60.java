package defpackage;

import android.view.ViewGroup;
import com.facebook.react.bridge.JSApplicationCausedNativeException;

/* renamed from: b60 */
/* loaded from: classes.dex */
public class C2262b60 extends JSApplicationCausedNativeException {
    public final ViewGroup a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2262b60(String str) {
        super(str);
        O90.f(str, "msg");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2262b60(String str, ViewGroup viewGroup, Throwable th) {
        super(str, th);
        O90.f(str, "msg");
        this.a = viewGroup;
    }
}
