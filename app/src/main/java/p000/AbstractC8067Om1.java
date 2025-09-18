package p000;

import java.lang.reflect.InvocationTargetException;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* renamed from: Om1 */
/* loaded from: classes.dex */
public abstract class AbstractC8067Om1 {

    /* renamed from: a */
    public static final InterfaceC8119Pm1 f8614a;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        C11370v32 c11370v32;
        try {
            WebViewProviderFactoryBoundaryInterface webViewProviderFactoryBoundaryInterface = (WebViewProviderFactoryBoundaryInterface) AbstractC1618Zi.m9579b(WebViewProviderFactoryBoundaryInterface.class, AbstractC8799b12.m10416a());
            C10525oT0 c10525oT0 = new C10525oT0();
            c10525oT0.f39025a = webViewProviderFactoryBoundaryInterface;
            c11370v32 = c10525oT0;
        } catch (ClassNotFoundException unused) {
            c11370v32 = new C11370v32(2);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
        f8614a = c11370v32;
    }
}
