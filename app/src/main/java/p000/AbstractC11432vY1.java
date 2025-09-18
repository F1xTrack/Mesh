package p000;

import com.facebook.imagepipeline.image.EncodedImage;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function2;

/* renamed from: vY1 */
/* loaded from: classes.dex */
public abstract class AbstractC11432vY1 {
    /* renamed from: a */
    public static final C1068Qy m25444a(InterfaceC0125Bz interfaceC0125Bz) {
        if (interfaceC0125Bz.mo937g(C7564Ev0.f2962e) == null) {
            interfaceC0125Bz = interfaceC0125Bz.mo936f(new C8148Qb0(null));
        }
        return new C1068Qy(interfaceC0125Bz);
    }

    /* renamed from: b */
    public static final void m25445b(InterfaceC0754Lz interfaceC0754Lz, CancellationException cancellationException) {
        InterfaceC8044Ob0 interfaceC8044Ob0 = (InterfaceC8044Ob0) interfaceC0754Lz.mo2469b().mo937g(C7564Ev0.f2962e);
        if (interfaceC8044Ob0 != null) {
            ((C9002cc0) interfaceC8044Ob0).m10810l(cancellationException);
        } else {
            throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + interfaceC0754Lz).toString());
        }
    }

    /* renamed from: c */
    public static final Object m25446c(Function2 function2, AbstractC9714i71 abstractC9714i71) throws Throwable {
        JV0 jv0 = new JV0(abstractC9714i71, abstractC9714i71.getContext());
        Object objM9091g = XZ1.m9091g(jv0, jv0, function2);
        EnumC0817Mz enumC0817Mz = EnumC0817Mz.f7418a;
        return objM9091g;
    }

    /* renamed from: d */
    public static final boolean m25447d(InterfaceC0754Lz interfaceC0754Lz) {
        InterfaceC8044Ob0 interfaceC8044Ob0 = (InterfaceC8044Ob0) interfaceC0754Lz.mo2469b().mo937g(C7564Ev0.f2962e);
        if (interfaceC8044Ob0 != null) {
            return interfaceC8044Ob0.isActive();
        }
        return true;
    }

    /* renamed from: e */
    public static final boolean m25448e(int i, int i2, C9115dS0 c9115dS0) {
        if (c9115dS0 == null) {
            if (((int) (i * 1.3333334f)) < 2048.0f || ((int) (i2 * 1.3333334f)) < 2048) {
                return false;
            }
        } else if (((int) (i * 1.3333334f)) < c9115dS0.f26115a || ((int) (i2 * 1.3333334f)) < c9115dS0.f26116b) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public static final boolean m25449f(EncodedImage encodedImage, C9115dS0 c9115dS0) throws Throwable {
        if (encodedImage == null) {
            return false;
        }
        int rotationAngle = encodedImage.getRotationAngle();
        return (rotationAngle == 90 || rotationAngle == 270) ? m25448e(encodedImage.getHeight(), encodedImage.getWidth(), c9115dS0) : m25448e(encodedImage.getWidth(), encodedImage.getHeight(), c9115dS0);
    }
}
