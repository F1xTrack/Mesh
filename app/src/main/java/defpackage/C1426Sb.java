package defpackage;

import android.view.View;
import com.facebook.react.uimanager.BaseViewManager;
import com.yandex.varioqub.config.model.ConfigValue;

/* renamed from: Sb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1426Sb extends U0 {
    @Override // defpackage.U0, defpackage.InterfaceC0364Ek1
    public final void T0(View view, String str, Object obj) {
        double dDoubleValue;
        InterfaceC0973Mg interfaceC0973Mg;
        str.getClass();
        dDoubleValue = ConfigValue.DOUBLE_DEFAULT_VALUE;
        interfaceC0973Mg = (InterfaceC0973Mg) this.b;
        switch (str) {
            case "disableAutoLayout":
                ((InterfaceC1504Tb) ((BaseViewManager) interfaceC0973Mg)).setDisableAutoLayout(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "enableInstrumentation":
                ((InterfaceC1504Tb) ((BaseViewManager) interfaceC0973Mg)).setEnableInstrumentation(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "scrollOffset":
                InterfaceC1504Tb interfaceC1504Tb = (InterfaceC1504Tb) ((BaseViewManager) interfaceC0973Mg);
                if (obj != null) {
                    dDoubleValue = ((Double) obj).doubleValue();
                }
                interfaceC1504Tb.setScrollOffset(view, dDoubleValue);
                break;
            case "horizontal":
                ((InterfaceC1504Tb) ((BaseViewManager) interfaceC0973Mg)).setHorizontal(view, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "renderAheadOffset":
                InterfaceC1504Tb interfaceC1504Tb2 = (InterfaceC1504Tb) ((BaseViewManager) interfaceC0973Mg);
                if (obj != null) {
                    dDoubleValue = ((Double) obj).doubleValue();
                }
                interfaceC1504Tb2.setRenderAheadOffset(view, dDoubleValue);
                break;
            case "windowSize":
                InterfaceC1504Tb interfaceC1504Tb3 = (InterfaceC1504Tb) ((BaseViewManager) interfaceC0973Mg);
                if (obj != null) {
                    dDoubleValue = ((Double) obj).doubleValue();
                }
                interfaceC1504Tb3.setWindowSize(view, dDoubleValue);
                break;
            default:
                super.T0(view, str, obj);
                break;
        }
    }
}
