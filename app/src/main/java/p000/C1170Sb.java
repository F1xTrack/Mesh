package p000;

import android.view.View;
import com.facebook.react.uimanager.BaseViewManager;
import com.yandex.varioqub.config.model.ConfigValue;

/* renamed from: Sb */
/* loaded from: classes.dex */
public final class C1170Sb extends AbstractC1259U0 {
    @Override // p000.AbstractC1259U0, p000.InterfaceC7543Ek1
    /* renamed from: T0 */
    public final void mo2373T0(View view, String str, Object obj) {
        double dDoubleValue;
        InterfaceC0798Mg interfaceC0798Mg;
        str.getClass();
        dDoubleValue = ConfigValue.DOUBLE_DEFAULT_VALUE;
        interfaceC0798Mg = (InterfaceC0798Mg) this.f11615b;
        switch (str) {
            case "disableAutoLayout":
                ((InterfaceC1233Tb) ((BaseViewManager) interfaceC0798Mg)).setDisableAutoLayout(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "enableInstrumentation":
                ((InterfaceC1233Tb) ((BaseViewManager) interfaceC0798Mg)).setEnableInstrumentation(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "scrollOffset":
                InterfaceC1233Tb interfaceC1233Tb = (InterfaceC1233Tb) ((BaseViewManager) interfaceC0798Mg);
                if (obj != null) {
                    dDoubleValue = ((Double) obj).doubleValue();
                }
                interfaceC1233Tb.setScrollOffset(view, dDoubleValue);
                break;
            case "horizontal":
                ((InterfaceC1233Tb) ((BaseViewManager) interfaceC0798Mg)).setHorizontal(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "renderAheadOffset":
                InterfaceC1233Tb interfaceC1233Tb2 = (InterfaceC1233Tb) ((BaseViewManager) interfaceC0798Mg);
                if (obj != null) {
                    dDoubleValue = ((Double) obj).doubleValue();
                }
                interfaceC1233Tb2.setRenderAheadOffset(view, dDoubleValue);
                break;
            case "windowSize":
                InterfaceC1233Tb interfaceC1233Tb3 = (InterfaceC1233Tb) ((BaseViewManager) interfaceC0798Mg);
                if (obj != null) {
                    dDoubleValue = ((Double) obj).doubleValue();
                }
                interfaceC1233Tb3.setWindowSize(view, dDoubleValue);
                break;
            default:
                super.mo2373T0(view, str, obj);
                break;
        }
    }
}
