package p000;

import android.view.View;
import android.view.autofill.AutofillId;
import java.util.Collection;

/* renamed from: ik1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9792ik1 {
    /* renamed from: a */
    public static void m19074a(View view, Collection<View> collection, int i) {
        view.addKeyboardNavigationClusters(collection, i);
    }

    /* renamed from: b */
    public static AutofillId m19075b(View view) {
        return view.getAutofillId();
    }

    /* renamed from: c */
    public static int m19076c(View view) {
        return view.getImportantForAutofill();
    }

    /* renamed from: d */
    public static int m19077d(View view) {
        return view.getNextClusterForwardId();
    }

    /* renamed from: e */
    public static boolean m19078e(View view) {
        return view.hasExplicitFocusable();
    }

    /* renamed from: f */
    public static boolean m19079f(View view) {
        return view.isFocusedByDefault();
    }

    /* renamed from: g */
    public static boolean m19080g(View view) {
        return view.isImportantForAutofill();
    }

    /* renamed from: h */
    public static boolean m19081h(View view) {
        return view.isKeyboardNavigationCluster();
    }

    /* renamed from: i */
    public static View m19082i(View view, View view2, int i) {
        return view.keyboardNavigationClusterSearch(view2, i);
    }

    /* renamed from: j */
    public static boolean m19083j(View view) {
        return view.restoreDefaultFocus();
    }

    /* renamed from: k */
    public static void m19084k(View view, String... strArr) {
        view.setAutofillHints(strArr);
    }

    /* renamed from: l */
    public static void m19085l(View view, boolean z) {
        view.setFocusedByDefault(z);
    }

    /* renamed from: m */
    public static void m19086m(View view, int i) {
        view.setImportantForAutofill(i);
    }

    /* renamed from: n */
    public static void m19087n(View view, boolean z) {
        view.setKeyboardNavigationCluster(z);
    }

    /* renamed from: o */
    public static void m19088o(View view, int i) {
        view.setNextClusterForwardId(i);
    }

    /* renamed from: p */
    public static void m19089p(View view, CharSequence charSequence) {
        view.setTooltipText(charSequence);
    }
}
