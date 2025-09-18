package p000;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.InputStream;

/* renamed from: Uf1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8365Uf1 implements InterfaceC11343us0 {

    /* renamed from: b */
    public static final C8365Uf1 f11971b = new C8365Uf1(0);

    /* renamed from: a */
    public final /* synthetic */ int f11972a;

    public /* synthetic */ C8365Uf1(int i) {
        this.f11972a = i;
    }

    @Override // p000.InterfaceC11343us0
    /* renamed from: a */
    public final InterfaceC11215ts0 mo8114a(T71 t71) {
        switch (this.f11972a) {
            case 0:
                return C8417Vf1.f12685b;
            case 1:
                return new C6382lk(0, new OJ1(8));
            case 2:
                return new C6382lk(0, new NV1(8));
            case 3:
                return new C8417Vf1(1);
            case 4:
                return new C10990s51(t71.m7575z(Uri.class, AssetFileDescriptor.class), 0);
            case 5:
                return new C10990s51(t71.m7575z(Uri.class, ParcelFileDescriptor.class), 0);
            case 6:
                return new C10990s51(t71.m7575z(Uri.class, InputStream.class), 0);
            case 7:
                return new C10990s51(t71.m7575z(E10.class, InputStream.class), 1);
            default:
                return new C9146dh1(t71.m7575z(E10.class, InputStream.class));
        }
    }
}
