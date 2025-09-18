package defpackage;

import android.widget.FrameLayout;
import kotlin.jvm.functions.Function2;

/* renamed from: ep, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3652ep extends AbstractC4286i71 implements Function2 {
    public final /* synthetic */ C4034gp a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3652ep(C4034gp c4034gp, InterfaceC1729Vy interfaceC1729Vy) {
        super(2, interfaceC1729Vy);
        this.a = c4034gp;
    }

    @Override // defpackage.AbstractC1594Uf
    public final InterfaceC1729Vy create(Object obj, InterfaceC1729Vy interfaceC1729Vy) {
        return new C3652ep(this.a, interfaceC1729Vy);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C3652ep c3652ep = (C3652ep) create((InterfaceC0952Lz) obj, (InterfaceC1729Vy) obj2);
        C1518Tf1 c1518Tf1 = C1518Tf1.a;
        c3652ep.invokeSuspend(c1518Tf1);
        return c1518Tf1;
    }

    @Override // defpackage.AbstractC1594Uf
    public final Object invokeSuspend(Object obj) {
        EnumC5461kD0 enumC5461kD0;
        EnumC5270jD0 enumC5270jD0;
        EnumC1030Mz enumC1030Mz = EnumC1030Mz.a;
        RQ1.d(obj);
        C4034gp c4034gp = this.a;
        boolean preview = c4034gp.getPreview();
        EnumC5270jD0 enumC5270jD02 = EnumC5270jD0.PERFORMANCE;
        EnumC5270jD0 enumC5270jD03 = EnumC5270jD0.COMPATIBLE;
        if (preview && c4034gp.getPreviewView$react_native_vision_camera_release() == null) {
            C5843mD0 c5843mD0 = new C5843mD0(c4034gp.getContext());
            c5843mD0.setOnHierarchyChangeListener(new ViewGroupOnHierarchyChangeListenerC6177nz(c5843mD0, 1));
            int iOrdinal = c4034gp.A.ordinal();
            if (iOrdinal == 0) {
                enumC5270jD0 = enumC5270jD02;
            } else {
                if (iOrdinal != 1) {
                    throw new C7074sg();
                }
                enumC5270jD0 = enumC5270jD03;
            }
            c5843mD0.setImplementationMode(enumC5270jD0);
            c5843mD0.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 17));
            SO0 so0 = new SO0();
            c5843mD0.getPreviewStreamState().e(c4034gp.G, new B7(14, new C3690f1(so0, 4, c4034gp)));
            c4034gp.setPreviewView$react_native_vision_camera_release(c5843mD0);
            c4034gp.addView(c4034gp.getPreviewView$react_native_vision_camera_release());
        } else if (!c4034gp.getPreview() && c4034gp.getPreviewView$react_native_vision_camera_release() != null) {
            c4034gp.removeView(c4034gp.getPreviewView$react_native_vision_camera_release());
            c4034gp.setPreviewView$react_native_vision_camera_release(null);
        }
        C5843mD0 previewView$react_native_vision_camera_release = c4034gp.getPreviewView$react_native_vision_camera_release();
        if (previewView$react_native_vision_camera_release != null) {
            int iOrdinal2 = c4034gp.getAndroidPreviewViewType().ordinal();
            if (iOrdinal2 != 0) {
                if (iOrdinal2 != 1) {
                    throw new C7074sg();
                }
                enumC5270jD02 = enumC5270jD03;
            }
            previewView$react_native_vision_camera_release.setImplementationMode(enumC5270jD02);
            int iOrdinal3 = c4034gp.getResizeMode().ordinal();
            if (iOrdinal3 == 0) {
                enumC5461kD0 = EnumC5461kD0.FILL_CENTER;
            } else {
                if (iOrdinal3 != 1) {
                    throw new C7074sg();
                }
                enumC5461kD0 = EnumC5461kD0.FIT_CENTER;
            }
            previewView$react_native_vision_camera_release.setScaleType(enumC5461kD0);
        }
        c4034gp.d();
        return C1518Tf1.a;
    }
}
