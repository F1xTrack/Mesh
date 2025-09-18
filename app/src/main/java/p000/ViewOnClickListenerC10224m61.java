package p000;

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
public final class ViewOnClickListenerC10224m61 extends AbstractC0075BB implements View.OnClickListener {

    /* renamed from: x */
    public static final /* synthetic */ int f37472x = 0;

    /* renamed from: h */
    public final int f37473h;

    /* renamed from: i */
    public final int f37474i;

    /* renamed from: j */
    public final LayoutInflater f37475j;

    /* renamed from: k */
    public final AbstractC9893jX0 f37476k;

    /* renamed from: l */
    public final SearchableInfo f37477l;

    /* renamed from: m */
    public final Context f37478m;

    /* renamed from: n */
    public final WeakHashMap f37479n;

    /* renamed from: o */
    public final int f37480o;

    /* renamed from: p */
    public int f37481p;

    /* renamed from: q */
    public ColorStateList f37482q;

    /* renamed from: r */
    public int f37483r;

    /* renamed from: s */
    public int f37484s;

    /* renamed from: t */
    public int f37485t;

    /* renamed from: u */
    public int f37486u;

    /* renamed from: v */
    public int f37487v;

    /* renamed from: w */
    public int f37488w;

    public ViewOnClickListenerC10224m61(Context context, AbstractC9893jX0 abstractC9893jX0, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        int suggestionRowLayout = abstractC9893jX0.getSuggestionRowLayout();
        this.f616b = true;
        this.f617c = null;
        this.f615a = false;
        this.f618d = -1;
        this.f619e = new C0317F1(this);
        this.f620f = new C0012AB(0, this);
        this.f37474i = suggestionRowLayout;
        this.f37473h = suggestionRowLayout;
        this.f37475j = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f37481p = 1;
        this.f37483r = -1;
        this.f37484s = -1;
        this.f37485t = -1;
        this.f37486u = -1;
        this.f37487v = -1;
        this.f37488w = -1;
        this.f37476k = abstractC9893jX0;
        this.f37477l = searchableInfo;
        this.f37480o = abstractC9893jX0.getSuggestionCommitIconResId();
        this.f37478m = context;
        this.f37479n = weakHashMap;
    }

    /* renamed from: h */
    public static String m22670h(Cursor cursor, int i) {
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
    @Override // p000.AbstractC0075BB
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo540a(android.view.View r22, android.database.Cursor r23) throws android.content.pm.PackageManager.NameNotFoundException, java.lang.NumberFormatException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 403
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ViewOnClickListenerC10224m61.mo540a(android.view.View, android.database.Cursor):void");
    }

    @Override // p000.AbstractC0075BB
    /* renamed from: b */
    public final void mo541b(Cursor cursor) {
        try {
            super.mo541b(cursor);
            if (cursor != null) {
                this.f37483r = cursor.getColumnIndex("suggest_text_1");
                this.f37484s = cursor.getColumnIndex("suggest_text_2");
                this.f37485t = cursor.getColumnIndex("suggest_text_2_url");
                this.f37486u = cursor.getColumnIndex("suggest_icon_1");
                this.f37487v = cursor.getColumnIndex("suggest_icon_2");
                this.f37488w = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception unused) {
        }
    }

    @Override // p000.AbstractC0075BB
    /* renamed from: c */
    public final String mo542c(Cursor cursor) {
        String strM22670h;
        String strM22670h2;
        if (cursor == null) {
            return null;
        }
        String strM22670h3 = m22670h(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (strM22670h3 != null) {
            return strM22670h3;
        }
        SearchableInfo searchableInfo = this.f37477l;
        if (searchableInfo.shouldRewriteQueryFromData() && (strM22670h2 = m22670h(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return strM22670h2;
        }
        if (!searchableInfo.shouldRewriteQueryFromText() || (strM22670h = m22670h(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return strM22670h;
    }

    @Override // p000.AbstractC0075BB
    /* renamed from: d */
    public final View mo543d(ViewGroup viewGroup) {
        View viewInflate = this.f37475j.inflate(this.f37473h, viewGroup, false);
        viewInflate.setTag(new C10096l61(viewInflate));
        ((ImageView) viewInflate.findViewById(R.id.edit_query)).setImageResource(this.f37480o);
        return viewInflate;
    }

    /* renamed from: e */
    public final Drawable m22671e(Uri uri) throws PackageManager.NameNotFoundException, NumberFormatException, FileNotFoundException {
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException(AbstractC11153tN0.m24911w("No authority: ", uri));
        }
        try {
            Resources resourcesForApplication = this.f37478m.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException(AbstractC11153tN0.m24911w("No path: ", uri));
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    identifier = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException(AbstractC11153tN0.m24911w("Single path segment is not a resource ID: ", uri));
                }
            } else {
                if (size != 2) {
                    throw new FileNotFoundException(AbstractC11153tN0.m24911w("More than two path segments: ", uri));
                }
                identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (identifier != 0) {
                return resourcesForApplication.getDrawable(identifier);
            }
            throw new FileNotFoundException(AbstractC11153tN0.m24911w("No resource found for: ", uri));
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException(AbstractC11153tN0.m24911w("No package found for authority: ", uri));
        }
    }

    /* renamed from: f */
    public final Drawable m22672f(String str) throws PackageManager.NameNotFoundException, NumberFormatException, IOException {
        WeakHashMap weakHashMap = this.f37479n;
        Context context = this.f37478m;
        Drawable drawableM22671e = null;
        if (str != null && !str.isEmpty() && !"0".equals(str)) {
            try {
                int i = Integer.parseInt(str);
                String str2 = "android.resource://" + context.getPackageName() + "/" + i;
                Drawable.ConstantState constantState = (Drawable.ConstantState) weakHashMap.get(str2);
                Drawable drawableNewDrawable = constantState == null ? null : constantState.newDrawable();
                if (drawableNewDrawable != null) {
                    return drawableNewDrawable;
                }
                Drawable drawableM4480b = AbstractC0628Jy.m4480b(context, i);
                if (drawableM4480b != null) {
                    weakHashMap.put(str2, drawableM4480b.getConstantState());
                }
                return drawableM4480b;
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
                            drawableM22671e = m22671e(uri);
                        } catch (Resources.NotFoundException unused3) {
                            throw new FileNotFoundException("Resource does not exist: " + uri);
                        }
                    } else {
                        InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
                        if (inputStreamOpenInputStream == null) {
                            throw new FileNotFoundException("Failed to open " + uri);
                        }
                        try {
                            drawableM22671e = Drawable.createFromStream(inputStreamOpenInputStream, null);
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
                if (drawableM22671e != null) {
                    weakHashMap.put(str, drawableM22671e.getConstantState());
                }
            }
        }
        return drawableM22671e;
    }

    /* renamed from: g */
    public final Cursor m22673g(SearchableInfo searchableInfo, String str) {
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
        return this.f37478m.getContentResolver().query(builderFragment.build(), null, suggestSelection, strArr2, null);
    }

    @Override // p000.AbstractC0075BB, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            View viewInflate = this.f37475j.inflate(this.f37474i, viewGroup, false);
            if (viewInflate != null) {
                ((C10096l61) viewInflate.getTag()).f36911a.setText(e.toString());
            }
            return viewInflate;
        }
    }

    @Override // p000.AbstractC0075BB, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            View viewMo543d = mo543d(viewGroup);
            ((C10096l61) viewMo543d.getTag()).f36911a.setText(e.toString());
            return viewMo543d;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Cursor cursor = this.f617c;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        Cursor cursor = this.f617c;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f37476k.m22060r((CharSequence) tag);
        }
    }
}
