package p000;

import android.widget.FrameLayout;
import kotlin.jvm.functions.Function2;

/* renamed from: ep */
/* loaded from: classes2.dex */
public final class C4014ep extends AbstractC9714i71 implements Function2 {

    /* renamed from: a */
    public final /* synthetic */ C4140gp f26889a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4014ep(C4140gp c4140gp, InterfaceC1382Vy interfaceC1382Vy) {
        super(2, interfaceC1382Vy);
        this.f26889a = c4140gp;
    }

    @Override // p000.AbstractC1300Uf
    public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
        return new C4014ep(this.f26889a, interfaceC1382Vy);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C4014ep c4014ep = (C4014ep) create((InterfaceC0754Lz) obj, (InterfaceC1382Vy) obj2);
        C8313Tf1 c8313Tf1 = C8313Tf1.f11463a;
        c4014ep.invokeSuspend(c8313Tf1);
        return c8313Tf1;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        EnumC9981kD0 enumC9981kD0;
        EnumC9853jD0 enumC9853jD0;
        EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
        RQ1.m7017d(obj);
        C4140gp c4140gp = this.f26889a;
        boolean preview = c4140gp.getPreview();
        EnumC9853jD0 enumC9853jD02 = EnumC9853jD0.PERFORMANCE;
        EnumC9853jD0 enumC9853jD03 = EnumC9853jD0.COMPATIBLE;
        if (preview && c4140gp.getPreviewView$react_native_vision_camera_release() == null) {
            C10237mD0 c10237mD0 = new C10237mD0(c4140gp.getContext());
            c10237mD0.setOnHierarchyChangeListener(new ViewGroupOnHierarchyChangeListenerC6523nz(c10237mD0, 1));
            int iOrdinal = c4140gp.f28003A.ordinal();
            if (iOrdinal == 0) {
                enumC9853jD0 = enumC9853jD02;
            } else {
                if (iOrdinal != 1) {
                    throw new C6838sg();
                }
                enumC9853jD0 = enumC9853jD03;
            }
            c10237mD0.setImplementationMode(enumC9853jD0);
            c10237mD0.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 17));
            SO0 so0 = new SO0();
            c10237mD0.getPreviewStreamState().m10133e(c4140gp.f28009G, new C0071B7(14, new C4027f1(so0, 4, c4140gp)));
            c4140gp.setPreviewView$react_native_vision_camera_release(c10237mD0);
            c4140gp.addView(c4140gp.getPreviewView$react_native_vision_camera_release());
        } else if (!c4140gp.getPreview() && c4140gp.getPreviewView$react_native_vision_camera_release() != null) {
            c4140gp.removeView(c4140gp.getPreviewView$react_native_vision_camera_release());
            c4140gp.setPreviewView$react_native_vision_camera_release(null);
        }
        C10237mD0 previewView$react_native_vision_camera_release = c4140gp.getPreviewView$react_native_vision_camera_release();
        if (previewView$react_native_vision_camera_release != null) {
            int iOrdinal2 = c4140gp.getAndroidPreviewViewType().ordinal();
            if (iOrdinal2 != 0) {
                if (iOrdinal2 != 1) {
                    throw new C6838sg();
                }
                enumC9853jD02 = enumC9853jD03;
            }
            previewView$react_native_vision_camera_release.setImplementationMode(enumC9853jD02);
            int iOrdinal3 = c4140gp.getResizeMode().ordinal();
            if (iOrdinal3 == 0) {
                enumC9981kD0 = EnumC9981kD0.FILL_CENTER;
            } else {
                if (iOrdinal3 != 1) {
                    throw new C6838sg();
                }
                enumC9981kD0 = EnumC9981kD0.FIT_CENTER;
            }
            previewView$react_native_vision_camera_release.setScaleType(enumC9981kD0);
        }
        c4140gp.m18651d();
        return C8313Tf1.f11463a;
    }
}
