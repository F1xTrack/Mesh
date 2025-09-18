package defpackage;

import android.content.ContentResolver;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: e9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3526e9 implements KC {
    public final /* synthetic */ int a;
    public Object b;
    public final Comparable c;
    public final Object d;

    public /* synthetic */ AbstractC3526e9(int i, Comparable comparable, Object obj) {
        this.a = i;
        this.d = obj;
        this.c = comparable;
    }

    @Override // defpackage.KC
    public final void b() {
        switch (this.a) {
            case 0:
                Object obj = this.b;
                if (obj != null) {
                    try {
                        g(obj);
                        break;
                    } catch (IOException unused) {
                        return;
                    }
                }
                break;
            default:
                Object obj2 = this.b;
                if (obj2 != null) {
                    try {
                        g(obj2);
                        break;
                    } catch (IOException unused2) {
                        return;
                    }
                }
                break;
        }
    }

    @Override // defpackage.KC
    public final void c(EnumC7561vD0 enumC7561vD0, JC jc) {
        switch (this.a) {
            case 0:
                try {
                    Object objI = i((AssetManager) this.d, (String) this.c);
                    this.b = objI;
                    jc.j(objI);
                    break;
                } catch (IOException e) {
                    jc.e(e);
                    return;
                }
            default:
                try {
                    Object objH = h((ContentResolver) this.d, (Uri) this.c);
                    this.b = objH;
                    jc.j(objH);
                    break;
                } catch (FileNotFoundException e2) {
                    jc.e(e2);
                }
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

    public abstract void g(Object obj);

    public abstract Object h(ContentResolver contentResolver, Uri uri);

    public abstract Object i(AssetManager assetManager, String str);

    private final void e() {
    }

    private final void f() {
    }
}
