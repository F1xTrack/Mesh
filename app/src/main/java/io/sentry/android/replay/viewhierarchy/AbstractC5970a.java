package io.sentry.android.replay.viewhierarchy;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import io.sentry.C5759D1;
import io.sentry.android.replay.AbstractC5975w;
import io.sentry.android.replay.util.AbstractC5963b;
import io.sentry.android.replay.util.C5962a;
import io.sentry.android.replay.util.C5964c;
import io.sentry.config.AbstractC6003a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import p000.AbstractC11374v51;
import p000.AbstractC7167xu;
import p000.InterfaceC6497nZ;
import p000.O90;

/* renamed from: io.sentry.android.replay.viewhierarchy.a */
/* loaded from: classes2.dex */
public abstract class AbstractC5970a {

    /* renamed from: a */
    public static WeakReference f34055a;

    /* renamed from: a */
    public static AbstractC5974e m21683a(LayoutNode layoutNode, AbstractC5974e abstractC5974e, int i, boolean z, C5759D1 c5759d1) {
        TextLayoutInput layoutInput;
        TextStyle style;
        AccessibilityAction accessibilityAction;
        InterfaceC6497nZ interfaceC6497nZ;
        if (!layoutNode.isPlaced() || !layoutNode.isAttached()) {
            return null;
        }
        if (z) {
            f34055a = new WeakReference(LayoutCoordinatesKt.findRootCoordinates(layoutNode.getCoordinates()));
        }
        SemanticsConfiguration collapsedSemantics$ui_release = layoutNode.getCollapsedSemantics$ui_release();
        LayoutCoordinates coordinates = layoutNode.getCoordinates();
        WeakReference weakReference = f34055a;
        Rect rectM21677a = AbstractC5963b.m21677a(coordinates, weakReference != null ? (LayoutCoordinates) weakReference.get() : null);
        boolean z2 = !layoutNode.getOuterCoordinator$ui_release().isTransparent() && (collapsedSemantics$ui_release == null || !collapsedSemantics$ui_release.contains(SemanticsProperties.INSTANCE.getInvisibleToUser())) && rectM21677a.height() > 0 && rectM21677a.width() > 0;
        boolean z3 = collapsedSemantics$ui_release != null && collapsedSemantics$ui_release.contains(SemanticsActions.INSTANCE.getSetText());
        if ((collapsedSemantics$ui_release == null || !collapsedSemantics$ui_release.contains(SemanticsProperties.INSTANCE.getText())) && !z3) {
            Painter painterM21678b = AbstractC5963b.m21678b(layoutNode);
            if (painterM21678b == null) {
                return new C5971b(rectM21677a.left, rectM21677a.top, layoutNode.getWidth(), layoutNode.getHeight(), abstractC5974e.m21688a(), i, abstractC5974e, z2 && m21686d(layoutNode, false, c5759d1), z2, rectM21677a);
            }
            return new C5972c(rectM21677a.left, rectM21677a.top, layoutNode.getWidth(), layoutNode.getHeight(), abstractC5974e.m21688a(), i, abstractC5974e, (z2 && m21686d(layoutNode, true, c5759d1)) && AbstractC5963b.m21680d(painterM21678b), z2, rectM21677a);
        }
        boolean z4 = z2 && m21686d(layoutNode, false, c5759d1);
        ArrayList arrayList = new ArrayList();
        if (collapsedSemantics$ui_release != null && (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(collapsedSemantics$ui_release, SemanticsActions.INSTANCE.getGetTextLayoutResult())) != null && (interfaceC6497nZ = (InterfaceC6497nZ) accessibilityAction.getAction()) != null) {
        }
        C5964c c5964cM21679c = AbstractC5963b.m21679c(layoutNode);
        Color colorM21681a = c5964cM21679c.m21681a();
        boolean zM21682b = c5964cM21679c.m21682b();
        TextLayoutResult textLayoutResult = (TextLayoutResult) AbstractC7167xu.m25957C(arrayList);
        Color color = (textLayoutResult == null || (layoutInput = textLayoutResult.getLayoutInput()) == null || (style = layoutInput.getStyle()) == null) ? null : Color.box-impl(style.getColor-0d7_KjU());
        if (color == null || color.unbox-impl() != Color.Companion.getUnspecified-0d7_KjU()) {
            colorM21681a = color;
        }
        return new C5973d((arrayList.isEmpty() || z3) ? null : new C5962a((TextLayoutResult) AbstractC7167xu.m25955A(arrayList), zM21682b), colorM21681a != null ? Integer.valueOf(AbstractC6003a.m21740I(ColorKt.toArgb-8_81llA(colorM21681a.unbox-impl()))) : null, rectM21677a.left, rectM21677a.top, layoutNode.getWidth(), layoutNode.getHeight(), abstractC5974e.m21688a(), i, abstractC5974e, z4, z2, rectM21677a);
    }

    /* renamed from: b */
    public static boolean m21684b(View view, AbstractC5974e abstractC5974e, C5759D1 c5759d1) {
        AbstractC11374v51.m25351p(view.getClass().getName(), "AndroidComposeView", false);
        return false;
    }

    /* renamed from: c */
    public static String m21685c(LayoutNode layoutNode, boolean z) {
        SemanticsConfiguration collapsedSemantics$ui_release;
        if (z) {
            return "android.widget.ImageView";
        }
        SemanticsConfiguration collapsedSemantics$ui_release2 = layoutNode.getCollapsedSemantics$ui_release();
        return ((collapsedSemantics$ui_release2 == null || !collapsedSemantics$ui_release2.contains(SemanticsProperties.INSTANCE.getText())) && ((collapsedSemantics$ui_release = layoutNode.getCollapsedSemantics$ui_release()) == null || !collapsedSemantics$ui_release.contains(SemanticsActions.INSTANCE.getSetText()))) ? "android.view.View" : "android.widget.TextView";
    }

    /* renamed from: d */
    public static boolean m21686d(LayoutNode layoutNode, boolean z, C5759D1 c5759d1) {
        SemanticsConfiguration collapsedSemantics$ui_release = layoutNode.getCollapsedSemantics$ui_release();
        String str = collapsedSemantics$ui_release != null ? (String) SemanticsConfigurationKt.getOrNull(collapsedSemantics$ui_release, AbstractC5975w.m21691a()) : null;
        if (O90.m5963a(str, "unmask")) {
            return false;
        }
        if (O90.m5963a(str, "mask")) {
            return true;
        }
        String strM21685c = m21685c(layoutNode, z);
        if (c5759d1.getSessionReplay().m21396b().contains(strM21685c)) {
            return false;
        }
        return c5759d1.getSessionReplay().m21395a().contains(strM21685c);
    }

    /* renamed from: e */
    public static void m21687e(LayoutNode layoutNode, AbstractC5974e abstractC5974e, boolean z, C5759D1 c5759d1) {
        List children$ui_release = layoutNode.getChildren$ui_release();
        if (children$ui_release.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(children$ui_release.size());
        int size = children$ui_release.size();
        for (int i = 0; i < size; i++) {
            LayoutNode layoutNode2 = (LayoutNode) children$ui_release.get(i);
            AbstractC5974e abstractC5974eM21683a = m21683a(layoutNode2, abstractC5974e, i, z, c5759d1);
            if (abstractC5974eM21683a != null) {
                arrayList.add(abstractC5974eM21683a);
                m21687e(layoutNode2, abstractC5974eM21683a, false, c5759d1);
            }
        }
        abstractC5974e.m21689b(arrayList);
    }
}
