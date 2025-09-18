package p000;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;

/* renamed from: Vp0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8436Vp0 implements InterfaceC0643KC {

    /* renamed from: d */
    public static final String[] f12786d = {"_data"};

    /* renamed from: a */
    public final /* synthetic */ int f12787a;

    /* renamed from: b */
    public final Object f12788b;

    /* renamed from: c */
    public final Object f12789c;

    public /* synthetic */ C8436Vp0(Object obj, int i, Object obj2) {
        this.f12787a = i;
        this.f12788b = obj;
        this.f12789c = obj2;
    }

    @Override // p000.InterfaceC0643KC
    /* renamed from: a */
    public final Class mo3254a() {
        switch (this.f12787a) {
            case 0:
                return File.class;
            default:
                return ((InterfaceC6319kk) this.f12789c).mo5742a();
        }
    }

    @Override // p000.InterfaceC0643KC
    /* renamed from: b */
    public final void mo3255b() {
        int i = this.f12787a;
    }

    @Override // p000.InterfaceC0643KC
    /* renamed from: c */
    public final void mo3256c(EnumC11389vD0 enumC11389vD0, InterfaceC0580JC interfaceC0580JC) {
        switch (this.f12787a) {
            case 0:
                Cursor cursorQuery = ((Context) this.f12788b).getContentResolver().query((Uri) this.f12789c, f12786d, null, null, null);
                if (cursorQuery != null) {
                    try {
                        string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data")) : null;
                    } finally {
                        cursorQuery.close();
                    }
                }
                if (!TextUtils.isEmpty(string)) {
                    interfaceC0580JC.mo557j(new File(string));
                    return;
                }
                interfaceC0580JC.mo556e(new FileNotFoundException("Failed to find file path for: " + ((Uri) this.f12789c)));
                return;
            default:
                interfaceC0580JC.mo557j(((InterfaceC6319kk) this.f12789c).mo5747h((byte[]) this.f12788b));
                return;
        }
    }

    @Override // p000.InterfaceC0643KC
    public final void cancel() {
        int i = this.f12787a;
    }

    @Override // p000.InterfaceC0643KC
    /* renamed from: d */
    public final EnumC1460XC mo3257d() {
        switch (this.f12787a) {
        }
        return EnumC1460XC.f13614a;
    }

    /* renamed from: e */
    private final void m8578e() {
    }

    /* renamed from: f */
    private final void m8579f() {
    }

    /* renamed from: g */
    private final void m8580g() {
    }

    /* renamed from: h */
    private final void m8581h() {
    }
}
