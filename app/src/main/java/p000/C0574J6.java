package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import ru.mes.dnevnik.R;

/* renamed from: J6 */
/* loaded from: classes.dex */
public final class C0574J6 {

    /* renamed from: b */
    public static final PorterDuff.Mode f5336b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c */
    public static C0574J6 f5337c;

    /* renamed from: a */
    public C11546wS0 f5338a;

    /* renamed from: a */
    public static synchronized C0574J6 m4154a() {
        try {
            if (f5337c == null) {
                m4156d();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f5337c;
    }

    /* renamed from: c */
    public static synchronized PorterDuffColorFilter m4155c(int i, PorterDuff.Mode mode) {
        return C11546wS0.m25619h(i, mode);
    }

    /* renamed from: d */
    public static synchronized void m4156d() {
        if (f5337c == null) {
            C0574J6 c0574j6 = new C0574J6();
            f5337c = c0574j6;
            c0574j6.f5338a = C11546wS0.m25618d();
            C11546wS0 c11546wS0 = f5337c.f5338a;
            C8128Pr0 c8128Pr0 = new C8128Pr0();
            c8128Pr0.f9303a = new int[]{R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};
            c8128Pr0.f9304b = new int[]{R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
            c8128Pr0.f9305c = new int[]{R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};
            c8128Pr0.f9306d = new int[]{R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};
            c8128Pr0.f9307e = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
            c8128Pr0.f9308f = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
            c11546wS0.m25630m(c8128Pr0);
        }
    }

    /* renamed from: e */
    public static void m4157e(Drawable drawable, C6649px c6649px, int[] iArr) {
        PorterDuff.Mode mode = C11546wS0.f44880h;
        int[] state = drawable.getState();
        if (drawable.mutate() == drawable) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            boolean z = c6649px.f40446b;
            if (z || c6649px.f40445a) {
                PorterDuffColorFilter porterDuffColorFilterM25619h = null;
                ColorStateList colorStateList = z ? (ColorStateList) c6649px.f40447c : null;
                PorterDuff.Mode mode2 = c6649px.f40445a ? (PorterDuff.Mode) c6649px.f40448d : C11546wS0.f44880h;
                if (colorStateList != null && mode2 != null) {
                    porterDuffColorFilterM25619h = C11546wS0.m25619h(colorStateList.getColorForState(iArr, 0), mode2);
                }
                drawable.setColorFilter(porterDuffColorFilterM25619h);
            } else {
                drawable.clearColorFilter();
            }
            if (Build.VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
            }
        }
    }

    /* renamed from: b */
    public final synchronized Drawable m4158b(Context context, int i) {
        return this.f5338a.m25625f(context, i);
    }
}
