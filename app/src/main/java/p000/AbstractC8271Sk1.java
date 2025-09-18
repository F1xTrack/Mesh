package p000;

import android.content.Context;
import java.lang.reflect.Method;
import java.util.HashMap;

/* renamed from: Sk1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8271Sk1 {

    /* renamed from: e */
    public static final C7959Mk1 f10958e;

    /* renamed from: f */
    public static final C7959Mk1 f10959f;

    /* renamed from: g */
    public static final C7959Mk1 f10960g;

    /* renamed from: h */
    public static final C7959Mk1 f10961h;

    /* renamed from: a */
    public final String f10962a;

    /* renamed from: b */
    public final String f10963b;

    /* renamed from: c */
    public final Method f10964c;

    /* renamed from: d */
    public final Integer f10965d;

    static {
        HashMap map = AbstractC8323Tk1.f11493a;
        f10958e = new C7959Mk1(2);
        f10959f = new C7959Mk1(3);
        f10960g = new C7959Mk1(1);
        f10961h = new C7959Mk1(2);
    }

    public AbstractC8271Sk1(InterfaceC9871jM0 interfaceC9871jM0, String str, Method method) {
        this.f10962a = interfaceC9871jM0.name();
        this.f10963b = "__default_type__".equals(interfaceC9871jM0.customType()) ? str : interfaceC9871jM0.customType();
        this.f10964c = method;
        this.f10965d = null;
    }

    /* renamed from: a */
    public abstract Object mo5830a(Context context, Object obj);

    public AbstractC8271Sk1(InterfaceC9999kM0 interfaceC9999kM0, String str, Method method, int i) {
        this.f10962a = interfaceC9999kM0.names()[i];
        this.f10963b = "__default_type__".equals(interfaceC9999kM0.customType()) ? str : interfaceC9999kM0.customType();
        this.f10964c = method;
        this.f10965d = Integer.valueOf(i);
    }
}
