package p000;

import android.content.ContentResolver;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: e9 */
/* loaded from: classes.dex */
public abstract class AbstractC3972e9 implements InterfaceC0643KC {

    /* renamed from: a */
    public final /* synthetic */ int f26565a;

    /* renamed from: b */
    public Object f26566b;

    /* renamed from: c */
    public final Comparable f26567c;

    /* renamed from: d */
    public final Object f26568d;

    public /* synthetic */ AbstractC3972e9(int i, Comparable comparable, Object obj) {
        this.f26565a = i;
        this.f26568d = obj;
        this.f26567c = comparable;
    }

    @Override // p000.InterfaceC0643KC
    /* renamed from: b */
    public final void mo3255b() {
        switch (this.f26565a) {
            case 0:
                Object obj = this.f26566b;
                if (obj != null) {
                    try {
                        mo9674g(obj);
                        break;
                    } catch (IOException unused) {
                        return;
                    }
                }
                break;
            default:
                Object obj2 = this.f26566b;
                if (obj2 != null) {
                    try {
                        mo9674g(obj2);
                        break;
                    } catch (IOException unused2) {
                        return;
                    }
                }
                break;
        }
    }

    @Override // p000.InterfaceC0643KC
    /* renamed from: c */
    public final void mo3256c(EnumC11389vD0 enumC11389vD0, InterfaceC0580JC interfaceC0580JC) {
        switch (this.f26565a) {
            case 0:
                try {
                    Object objMo17872i = mo17872i((AssetManager) this.f26568d, (String) this.f26567c);
                    this.f26566b = objMo17872i;
                    interfaceC0580JC.mo557j(objMo17872i);
                    break;
                } catch (IOException e) {
                    interfaceC0580JC.mo556e(e);
                    return;
                }
            default:
                try {
                    Object objMo9675h = mo9675h((ContentResolver) this.f26568d, (Uri) this.f26567c);
                    this.f26566b = objMo9675h;
                    interfaceC0580JC.mo557j(objMo9675h);
                    break;
                } catch (FileNotFoundException e2) {
                    interfaceC0580JC.mo556e(e2);
                }
        }
    }

    @Override // p000.InterfaceC0643KC
    public final void cancel() {
        int i = this.f26565a;
    }

    @Override // p000.InterfaceC0643KC
    /* renamed from: d */
    public final EnumC1460XC mo3257d() {
        switch (this.f26565a) {
        }
        return EnumC1460XC.f13614a;
    }

    /* renamed from: g */
    public abstract void mo9674g(Object obj);

    /* renamed from: h */
    public abstract Object mo9675h(ContentResolver contentResolver, Uri uri);

    /* renamed from: i */
    public abstract Object mo17872i(AssetManager assetManager, String str);

    /* renamed from: e */
    private final void m17870e() {
    }

    /* renamed from: f */
    private final void m17871f() {
    }
}
