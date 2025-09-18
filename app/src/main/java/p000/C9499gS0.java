package p000;

import android.util.Size;

/* renamed from: gS0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9499gS0 extends AbstractC8418Vg0 implements InterfaceC6497nZ {

    /* renamed from: e */
    public final /* synthetic */ int f27805e;

    /* renamed from: f */
    public final /* synthetic */ Size f27806f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9499gS0(Size size, int i) {
        super(1);
        this.f27805e = i;
        this.f27806f = size;
    }

    @Override // p000.InterfaceC6497nZ
    public final Object invoke(Object obj) {
        switch (this.f27805e) {
            case 0:
                O90.m5965c((Size) obj);
                float width = r3.getWidth() / r3.getHeight();
                Size size = this.f27806f;
                return Float.valueOf(Math.abs(width - (size.getWidth() / size.getHeight())));
            default:
                Size size2 = (Size) obj;
                O90.m5965c(size2);
                int height = size2.getHeight() * size2.getWidth();
                Size size3 = this.f27806f;
                return Integer.valueOf(Math.abs(height - (size3.getHeight() * size3.getWidth())));
        }
    }
}
