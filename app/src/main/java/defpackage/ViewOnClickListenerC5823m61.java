package defpackage;

import android.app.SearchableInfo;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import ru.mes.dnevnik.R;

/* renamed from: m61 */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC5823m61 extends BB implements View.OnClickListener {
    public static final /* synthetic */ int x = 0;
    public final int h;
    public final int i;
    public final LayoutInflater j;
    public final AbstractC5330jX0 k;
    public final SearchableInfo l;
    public final Context m;
    public final WeakHashMap n;
    public final int o;
    public int p;
    public ColorStateList q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;

    public ViewOnClickListenerC5823m61(Context context, AbstractC5330jX0 abstractC5330jX0, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        int suggestionRowLayout = abstractC5330jX0.getSuggestionRowLayout();
        this.b = true;
        this.c = null;
        this.a = false;
        this.d = -1;
        this.e = new F1(this);
        this.f = new AB(0, this);
        this.i = suggestionRowLayout;
        this.h = suggestionRowLayout;
        this.j = (LayoutInflater) context.getSystemService("layout_inflater");
        this.p = 1;
        this.r = -1;
        this.s = -1;
        this.t = -1;
        this.u = -1;
        this.v = -1;
        this.w = -1;
        this.k = abstractC5330jX0;
        this.l = searchableInfo;
        this.o = abstractC5330jX0.getSuggestionCommitIconResId();
        this.m = context;
        this.n = weakHashMap;
    }

    public static String h(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0125  */
    @Override // defpackage.BB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(android.view.View r22, android.database.Cursor r23) throws android.content.pm.PackageManager.NameNotFoundException, java.lang.NumberFormatException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 403
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ViewOnClickListenerC5823m61.a(android.view.View, android.database.Cursor):void");
    }

    @Override // defpackage.BB
    public final void b(Cursor cursor) {
        try {
            super.b(cursor);
            if (cursor != null) {
                this.r = cursor.getColumnIndex("suggest_text_1");
                this.s = cursor.getColumnIndex("suggest_text_2");
                this.t = cursor.getColumnIndex("suggest_text_2_url");
                this.u = cursor.getColumnIndex("suggest_icon_1");
                this.v = cursor.getColumnIndex("suggest_icon_2");
                this.w = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception unused) {
        }
    }

    @Override // defpackage.BB
    public final String c(Cursor cursor) {
        String strH;
        String strH2;
        if (cursor == null) {
            return null;
        }
        String strH3 = h(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (strH3 != null) {
            return strH3;
        }
        SearchableInfo searchableInfo = this.l;
        if (searchableInfo.shouldRewriteQueryFromData() && (strH2 = h(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return strH2;
        }
        if (!searchableInfo.shouldRewriteQueryFromText() || (strH = h(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return strH;
    }

    @Override // defpackage.BB
    public final View d(ViewGroup viewGroup) {
        View viewInflate = this.j.inflate(this.h, viewGroup, false);
        viewInflate.setTag(new C5632l61(viewInflate));
        ((ImageView) viewInflate.findViewById(R.id.edit_query)).setImageResource(this.o);
        return viewInflate;
    }

    public final Drawable e(Uri uri) throws PackageManager.NameNotFoundException, NumberFormatException, FileNotFoundException {
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException(AbstractC7209tN0.w("No authority: ", uri));
        }
        try {
            Resources resourcesForApplication = this.m.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException(AbstractC7209tN0.w("No path: ", uri));
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    identifier = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException(AbstractC7209tN0.w("Single path segment is not a resource ID: ", uri));
                }
            } else {
                if (size != 2) {
                    throw new FileNotFoundException(AbstractC7209tN0.w("More than two path segments: ", uri));
                }
                identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (identifier != 0) {
                return resourcesForApplication.getDrawable(identifier);
            }
            throw new FileNotFoundException(AbstractC7209tN0.w("No resource found for: ", uri));
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException(AbstractC7209tN0.w("No package found for authority: ", uri));
        }
    }

    public final Drawable f(String str) throws PackageManager.NameNotFoundException, NumberFormatException, IOException {
        WeakHashMap weakHashMap = this.n;
        Context context = this.m;
        Drawable drawableE = null;
        if (str != null && !str.isEmpty() && !"0".equals(str)) {
            try {
                int i = Integer.parseInt(str);
                String str2 = "android.resource://" + context.getPackageName() + "/" + i;
                Drawable.ConstantState constantState = (Drawable.ConstantState) weakHashMap.get(str2);
                Drawable drawableNewDrawable = constantState == null ? null : constantState.newDrawable();
                if (drawableNewDrawable != null) {
                    return drawableNewDrawable;
                }
                Drawable drawableB = AbstractC0794Jy.b(context, i);
                if (drawableB != null) {
                    weakHashMap.put(str2, drawableB.getConstantState());
                }
                return drawableB;
            } catch (Resources.NotFoundException unused) {
                return null;
            } catch (NumberFormatException unused2) {
                Drawable.ConstantState constantState2 = (Drawable.ConstantState) weakHashMap.get(str);
                Drawable drawableNewDrawable2 = constantState2 == null ? null : constantState2.newDrawable();
                if (drawableNewDrawable2 != null) {
                    return drawableNewDrawable2;
                }
                Uri uri = Uri.parse(str);
                try {
                    if ("android.resource".equals(uri.getScheme())) {
                        try {
                            drawableE = e(uri);
                        } catch (Resources.NotFoundException unused3) {
                            throw new FileNotFoundException("Resource does not exist: " + uri);
                        }
                    } else {
                        InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
                        if (inputStreamOpenInputStream == null) {
                            throw new FileNotFoundException("Failed to open " + uri);
                        }
                        try {
                            drawableE = Drawable.createFromStream(inputStreamOpenInputStream, null);
                        } finally {
                            try {
                                inputStreamOpenInputStream.close();
                            } catch (IOException unused4) {
                                uri.toString();
                            }
                        }
                    }
                } catch (FileNotFoundException e) {
                    Objects.toString(uri);
                    e.getMessage();
                }
                if (drawableE != null) {
                    weakHashMap.put(str, drawableE.getConstantState());
                }
            }
        }
        return drawableE;
    }

    public final Cursor g(SearchableInfo searchableInfo, String str) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder builderFragment = new Uri.Builder().scheme(RemoteMessageConst.Notification.CONTENT).authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            builderFragment.appendEncodedPath(suggestPath);
        }
        builderFragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            builderFragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        builderFragment.appendQueryParameter("limit", String.valueOf(50));
        return this.m.getContentResolver().query(builderFragment.build(), null, suggestSelection, strArr2, null);
    }

    @Override // defpackage.BB, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            View viewInflate = this.j.inflate(this.i, viewGroup, false);
            if (viewInflate != null) {
                ((C5632l61) viewInflate.getTag()).a.setText(e.toString());
            }
            return viewInflate;
        }
    }

    @Override // defpackage.BB, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            View viewD = d(viewGroup);
            ((C5632l61) viewD.getTag()).a.setText(e.toString());
            return viewD;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Cursor cursor = this.c;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        Cursor cursor = this.c;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.k.r((CharSequence) tag);
        }
    }
}
