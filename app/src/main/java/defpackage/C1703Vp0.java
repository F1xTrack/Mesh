package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;

/* renamed from: Vp0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1703Vp0 implements KC {
    public static final String[] d = {"_data"};
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ C1703Vp0(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.KC
    public final Class a() {
        switch (this.a) {
            case 0:
                return File.class;
            default:
                return ((InterfaceC5559kk) this.c).a();
        }
    }

    @Override // defpackage.KC
    public final void b() {
        int i = this.a;
    }

    @Override // defpackage.KC
    public final void c(EnumC7561vD0 enumC7561vD0, JC jc) {
        switch (this.a) {
            case 0:
                Cursor cursorQuery = ((Context) this.b).getContentResolver().query((Uri) this.c, d, null, null, null);
                if (cursorQuery != null) {
                    try {
                        string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data")) : null;
                    } finally {
                        cursorQuery.close();
                    }
                }
                if (!TextUtils.isEmpty(string)) {
                    jc.j(new File(string));
                    return;
                }
                jc.e(new FileNotFoundException("Failed to find file path for: " + ((Uri) this.c)));
                return;
            default:
                jc.j(((InterfaceC5559kk) this.c).h((byte[]) this.b));
                return;
        }
    }

    @Override // defpackage.KC
    public final void cancel() {
        int i = this.a;
    }

    @Override // defpackage.KC
    public final XC d() {
        switch (this.a) {
        }
        return XC.a;
    }

    private final void e() {
    }

    private final void f() {
    }

    private final void g() {
    }

    private final void h() {
    }
}
