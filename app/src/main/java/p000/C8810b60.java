package p000;

import android.view.ViewGroup;
import com.facebook.react.bridge.JSApplicationCausedNativeException;

/* renamed from: b60 */
/* loaded from: classes.dex */
public class C8810b60 extends JSApplicationCausedNativeException {

    /* renamed from: a */
    public final ViewGroup f16746a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8810b60(String str) {
        super(str);
        O90.m5968f(str, "msg");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8810b60(String str, ViewGroup viewGroup, Throwable th) {
        super(str, th);
        O90.m5968f(str, "msg");
        this.f16746a = viewGroup;
    }
}
