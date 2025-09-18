package p000;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.InputStream;

/* renamed from: tS0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11163tS0 implements InterfaceC11343us0 {

    /* renamed from: a */
    public final /* synthetic */ int f43081a;

    /* renamed from: b */
    public final Resources f43082b;

    public /* synthetic */ C11163tS0(Resources resources, int i) {
        this.f43081a = i;
        this.f43082b = resources;
    }

    @Override // p000.InterfaceC11343us0
    /* renamed from: a */
    public final InterfaceC11215ts0 mo8114a(T71 t71) {
        switch (this.f43081a) {
            case 0:
                return new C4098g9(this.f43082b, t71.m7575z(Uri.class, AssetFileDescriptor.class));
            case 1:
                return new C4098g9(this.f43082b, t71.m7575z(Uri.class, ParcelFileDescriptor.class));
            case 2:
                return new C4098g9(this.f43082b, t71.m7575z(Uri.class, InputStream.class));
            default:
                return new C4098g9(this.f43082b, C8417Vf1.f12685b);
        }
    }
}
