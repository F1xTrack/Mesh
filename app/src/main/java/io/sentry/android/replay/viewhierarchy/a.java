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
import defpackage.AbstractC7538v51;
import defpackage.AbstractC8069xu;
import defpackage.InterfaceC6099nZ;
import defpackage.O90;
import io.sentry.D1;
import io.sentry.android.replay.w;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class a {
    public static WeakReference a;

    public static e a(LayoutNode layoutNode, e eVar, int i, boolean z, D1 d1) {
        TextLayoutInput layoutInput;
        TextStyle style;
        AccessibilityAction accessibilityAction;
        InterfaceC6099nZ interfaceC6099nZ;
        if (!layoutNode.isPlaced() || !layoutNode.isAttached()) {
            return null;
        }
        if (z) {
            a = new WeakReference(LayoutCoordinatesKt.findRootCoordinates(layoutNode.getCoordinates()));
        }
        SemanticsConfiguration collapsedSemantics$ui_release = layoutNode.getCollapsedSemantics$ui_release();
        LayoutCoordinates coordinates = layoutNode.getCoordinates();
        WeakReference weakReference = a;
        Rect rectA = io.sentry.android.replay.util.b.a(coordinates, weakReference != null ? (LayoutCoordinates) weakReference.get() : null);
        boolean z2 = !layoutNode.getOuterCoordinator$ui_release().isTransparent() && (collapsedSemantics$ui_release == null || !collapsedSemantics$ui_release.contains(SemanticsProperties.INSTANCE.getInvisibleToUser())) && rectA.height() > 0 && rectA.width() > 0;
        boolean z3 = collapsedSemantics$ui_release != null && collapsedSemantics$ui_release.contains(SemanticsActions.INSTANCE.getSetText());
        if ((collapsedSemantics$ui_release == null || !collapsedSemantics$ui_release.contains(SemanticsProperties.INSTANCE.getText())) && !z3) {
            Painter painterB = io.sentry.android.replay.util.b.b(layoutNode);
            if (painterB == null) {
                return new b(rectA.left, rectA.top, layoutNode.getWidth(), layoutNode.getHeight(), eVar.a(), i, eVar, z2 && d(layoutNode, false, d1), z2, rectA);
            }
            return new c(rectA.left, rectA.top, layoutNode.getWidth(), layoutNode.getHeight(), eVar.a(), i, eVar, (z2 && d(layoutNode, true, d1)) && io.sentry.android.replay.util.b.d(painterB), z2, rectA);
        }
        boolean z4 = z2 && d(layoutNode, false, d1);
        ArrayList arrayList = new ArrayList();
        if (collapsedSemantics$ui_release != null && (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(collapsedSemantics$ui_release, SemanticsActions.INSTANCE.getGetTextLayoutResult())) != null && (interfaceC6099nZ = (InterfaceC6099nZ) accessibilityAction.getAction()) != null) {
        }
        io.sentry.android.replay.util.c cVarC = io.sentry.android.replay.util.b.c(layoutNode);
        Color colorA = cVarC.a();
        boolean zB = cVarC.b();
        TextLayoutResult textLayoutResult = (TextLayoutResult) AbstractC8069xu.C(arrayList);
        Color color = (textLayoutResult == null || (layoutInput = textLayoutResult.getLayoutInput()) == null || (style = layoutInput.getStyle()) == null) ? null : Color.box-impl(style.getColor-0d7_KjU());
        if (color == null || color.unbox-impl() != Color.Companion.getUnspecified-0d7_KjU()) {
            colorA = color;
        }
        return new d((arrayList.isEmpty() || z3) ? null : new io.sentry.android.replay.util.a((TextLayoutResult) AbstractC8069xu.A(arrayList), zB), colorA != null ? Integer.valueOf(io.sentry.config.a.I(ColorKt.toArgb-8_81llA(colorA.unbox-impl()))) : null, rectA.left, rectA.top, layoutNode.getWidth(), layoutNode.getHeight(), eVar.a(), i, eVar, z4, z2, rectA);
    }

    public static boolean b(View view, e eVar, D1 d1) {
        AbstractC7538v51.p(view.getClass().getName(), "AndroidComposeView", false);
        return false;
    }

    public static String c(LayoutNode layoutNode, boolean z) {
        SemanticsConfiguration collapsedSemantics$ui_release;
        if (z) {
            return "android.widget.ImageView";
        }
        SemanticsConfiguration collapsedSemantics$ui_release2 = layoutNode.getCollapsedSemantics$ui_release();
        return ((collapsedSemantics$ui_release2 == null || !collapsedSemantics$ui_release2.contains(SemanticsProperties.INSTANCE.getText())) && ((collapsedSemantics$ui_release = layoutNode.getCollapsedSemantics$ui_release()) == null || !collapsedSemantics$ui_release.contains(SemanticsActions.INSTANCE.getSetText()))) ? "android.view.View" : "android.widget.TextView";
    }

    public static boolean d(LayoutNode layoutNode, boolean z, D1 d1) {
        SemanticsConfiguration collapsedSemantics$ui_release = layoutNode.getCollapsedSemantics$ui_release();
        String str = collapsedSemantics$ui_release != null ? (String) SemanticsConfigurationKt.getOrNull(collapsedSemantics$ui_release, w.a()) : null;
        if (O90.a(str, "unmask")) {
            return false;
        }
        if (O90.a(str, "mask")) {
            return true;
        }
        String strC = c(layoutNode, z);
        if (d1.getSessionReplay().b().contains(strC)) {
            return false;
        }
        return d1.getSessionReplay().a().contains(strC);
    }

    public static void e(LayoutNode layoutNode, e eVar, boolean z, D1 d1) {
        List children$ui_release = layoutNode.getChildren$ui_release();
        if (children$ui_release.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(children$ui_release.size());
        int size = children$ui_release.size();
        for (int i = 0; i < size; i++) {
            LayoutNode layoutNode2 = (LayoutNode) children$ui_release.get(i);
            e eVarA = a(layoutNode2, eVar, i, z, d1);
            if (eVarA != null) {
                arrayList.add(eVarA);
                e(layoutNode2, eVarA, false, d1);
            }
        }
        eVar.b(arrayList);
    }
}
