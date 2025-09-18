package defpackage;

import android.content.Context;
import java.lang.reflect.Method;
import java.util.HashMap;

/* renamed from: Sk1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1455Sk1 {
    public static final C0987Mk1 e;
    public static final C0987Mk1 f;
    public static final C0987Mk1 g;
    public static final C0987Mk1 h;
    public final String a;
    public final String b;
    public final Method c;
    public final Integer d;

    static {
        HashMap map = AbstractC1533Tk1.a;
        e = new C0987Mk1(2);
        f = new C0987Mk1(3);
        g = new C0987Mk1(1);
        h = new C0987Mk1(2);
    }

    public AbstractC1455Sk1(InterfaceC5297jM0 interfaceC5297jM0, String str, Method method) {
        this.a = interfaceC5297jM0.name();
        this.b = "__default_type__".equals(interfaceC5297jM0.customType()) ? str : interfaceC5297jM0.customType();
        this.c = method;
        this.d = null;
    }

    public abstract Object a(Context context, Object obj);

    public AbstractC1455Sk1(InterfaceC5488kM0 interfaceC5488kM0, String str, Method method, int i) {
        this.a = interfaceC5488kM0.names()[i];
        this.b = "__default_type__".equals(interfaceC5488kM0.customType()) ? str : interfaceC5488kM0.customType();
        this.c = method;
        this.d = Integer.valueOf(i);
    }
}
