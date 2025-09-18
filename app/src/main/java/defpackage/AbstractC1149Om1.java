package defpackage;

import java.lang.reflect.InvocationTargetException;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* renamed from: Om1 */
/* loaded from: classes.dex */
public abstract class AbstractC1149Om1 {
    public static final InterfaceC1227Pm1 a;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        C7532v32 c7532v32;
        try {
            WebViewProviderFactoryBoundaryInterface webViewProviderFactoryBoundaryInterface = (WebViewProviderFactoryBoundaryInterface) AbstractC1993Zi.b(WebViewProviderFactoryBoundaryInterface.class, AbstractC2246b12.a());
            C6273oT0 c6273oT0 = new C6273oT0();
            c6273oT0.a = webViewProviderFactoryBoundaryInterface;
            c7532v32 = c6273oT0;
        } catch (ClassNotFoundException unused) {
            c7532v32 = new C7532v32(2);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
        a = c7532v32;
    }
}
