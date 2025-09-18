package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import ru.mes.dnevnik.R;

/* loaded from: classes.dex */
public final class J6 {
    public static final PorterDuff.Mode b = PorterDuff.Mode.SRC_IN;
    public static J6 c;
    public C7796wS0 a;

    public static synchronized J6 a() {
        try {
            if (c == null) {
                d();
            }
        } catch (Throwable th) {
            throw th;
        }
        return c;
    }

    public static synchronized PorterDuffColorFilter c(int i, PorterDuff.Mode mode) {
        return C7796wS0.h(i, mode);
    }

    public static synchronized void d() {
        if (c == null) {
            J6 j6 = new J6();
            c = j6;
            j6.a = C7796wS0.d();
            C7796wS0 c7796wS0 = c.a;
            C1241Pr0 c1241Pr0 = new C1241Pr0();
            c1241Pr0.a = new int[]{R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};
            c1241Pr0.b = new int[]{R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
            c1241Pr0.c = new int[]{R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};
            c1241Pr0.d = new int[]{R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};
            c1241Pr0.e = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
            c1241Pr0.f = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
            c7796wS0.m(c1241Pr0);
        }
    }

    public static void e(Drawable drawable, C6553px c6553px, int[] iArr) {
        PorterDuff.Mode mode = C7796wS0.h;
        int[] state = drawable.getState();
        if (drawable.mutate() == drawable) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            boolean z = c6553px.b;
            if (z || c6553px.a) {
                PorterDuffColorFilter porterDuffColorFilterH = null;
                ColorStateList colorStateList = z ? (ColorStateList) c6553px.c : null;
                PorterDuff.Mode mode2 = c6553px.a ? (PorterDuff.Mode) c6553px.d : C7796wS0.h;
                if (colorStateList != null && mode2 != null) {
                    porterDuffColorFilterH = C7796wS0.h(colorStateList.getColorForState(iArr, 0), mode2);
                }
                drawable.setColorFilter(porterDuffColorFilterH);
            } else {
                drawable.clearColorFilter();
            }
            if (Build.VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
            }
        }
    }

    public final synchronized Drawable b(Context context, int i) {
        return this.a.f(context, i);
    }
}
