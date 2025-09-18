package defpackage;

import android.util.Size;

/* renamed from: gS0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3966gS0 extends AbstractC1676Vg0 implements InterfaceC6099nZ {
    public final /* synthetic */ int e;
    public final /* synthetic */ Size f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3966gS0(Size size, int i) {
        super(1);
        this.e = i;
        this.f = size;
    }

    @Override // defpackage.InterfaceC6099nZ
    public final Object invoke(Object obj) {
        switch (this.e) {
            case 0:
                O90.c((Size) obj);
                float width = r3.getWidth() / r3.getHeight();
                Size size = this.f;
                return Float.valueOf(Math.abs(width - (size.getWidth() / size.getHeight())));
            default:
                Size size2 = (Size) obj;
                O90.c(size2);
                int height = size2.getHeight() * size2.getWidth();
                Size size3 = this.f;
                return Integer.valueOf(Math.abs(height - (size3.getHeight() * size3.getWidth())));
        }
    }
}
