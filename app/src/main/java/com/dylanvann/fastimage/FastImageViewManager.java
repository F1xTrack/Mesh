package com.dylanvann.fastimage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bumptech.glide.ComponentCallbacks2C1874a;
import com.dylanvann.fastimage.events.FastImageErrorEvent;
import com.dylanvann.fastimage.events.FastImageLoadStartEvent;
import com.dylanvann.fastimage.events.FastImageProgressEvent;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.SimpleViewManager;
import com.huawei.hms.p015rn.push.constants.RemoteMessageAttributes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import p000.AbstractC10889rJ0;
import p000.AbstractC7202yS;
import p000.C0029AS;
import p000.C0926Oi;
import p000.C10779qS0;
import p000.C11671xR0;
import p000.E10;
import p000.InterfaceC6947uP;
import p000.InterfaceC9871jM0;
import p000.JR0;
import p000.OZ1;
import p000.PR0;
import p000.S91;

/* loaded from: classes.dex */
class FastImageViewManager extends SimpleViewManager<C0029AS> implements FastImageProgressListener {
    static final String REACT_CLASS = "FastImageView";
    static final String REACT_ON_LOAD_START_EVENT = "onFastImageLoadStart";
    static final String REACT_ON_PROGRESS_EVENT = "onFastImageProgress";
    private static final Map<String, List<C0029AS>> VIEWS_FOR_URLS = new WeakHashMap();
    private JR0 requestManager = null;

    private static Activity getActivityFromContext(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof S91)) {
            return null;
        }
        Context baseContext = ((S91) context).getBaseContext();
        if (baseContext instanceof Activity) {
            return (Activity) baseContext;
        }
        if (!(baseContext instanceof ContextWrapper)) {
            return null;
        }
        Context baseContext2 = ((ContextWrapper) baseContext).getBaseContext();
        if (baseContext2 instanceof Activity) {
            return (Activity) baseContext2;
        }
        return null;
    }

    private static boolean isActivityDestroyed(Activity activity) {
        return activity.isDestroyed() || activity.isFinishing();
    }

    private static boolean isValidContextForGlide(Context context) {
        if (getActivityFromContext(context) == null) {
            return false;
        }
        return !isActivityDestroyed(r0);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        C0926Oi c0926OiM24254a = AbstractC10889rJ0.m24254a();
        c0926OiM24254a.m6125k(REACT_ON_LOAD_START_EVENT, AbstractC10889rJ0.m24256c("registrationName", REACT_ON_LOAD_START_EVENT));
        c0926OiM24254a.m6125k(REACT_ON_PROGRESS_EVENT, AbstractC10889rJ0.m24256c("registrationName", REACT_ON_PROGRESS_EVENT));
        c0926OiM24254a.m6125k("onFastImageLoad", AbstractC10889rJ0.m24256c("registrationName", "onFastImageLoad"));
        c0926OiM24254a.m6125k("onFastImageError", AbstractC10889rJ0.m24256c("registrationName", "onFastImageError"));
        c0926OiM24254a.m6125k("onFastImageLoadEnd", AbstractC10889rJ0.m24256c("registrationName", "onFastImageLoadEnd"));
        return c0926OiM24254a.m6122h();
    }

    @Override // com.dylanvann.fastimage.FastImageProgressListener
    public float getGranularityPercentage() {
        return 0.5f;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.dylanvann.fastimage.FastImageProgressListener
    public void onProgress(String str, long j, long j2) {
        List<C0029AS> list = VIEWS_FOR_URLS.get(str);
        if (list != null) {
            for (C0029AS c0029as : list) {
                S91 s91 = (S91) c0029as.getContext();
                InterfaceC6947uP interfaceC6947uPM6091b = OZ1.m6091b(s91, c0029as.getId());
                FastImageProgressEvent fastImageProgressEvent = new FastImageProgressEvent(OZ1.m6093d(s91), c0029as.getId(), (int) j, (int) j2);
                if (interfaceC6947uPM6091b != null) {
                    interfaceC6947uPM6091b.mo11046g(fastImageProgressEvent);
                }
            }
        }
    }

    @InterfaceC9871jM0(name = "defaultSource")
    public void setDefaultSource(C0029AS c0029as, String str) {
        Drawable drawableM23999a = C10779qS0.f40878b.m23999a(c0029as.getContext(), str);
        c0029as.f194d = true;
        c0029as.f196f = drawableM23999a;
    }

    @InterfaceC9871jM0(name = "resizeMode")
    public void setResizeMode(C0029AS c0029as, String str) {
        c0029as.setScaleType((ImageView.ScaleType) AbstractC7202yS.m26152c("resizeMode", "cover", AbstractC7202yS.f46261d, str));
    }

    @InterfaceC9871jM0(name = "source")
    public void setSource(C0029AS c0029as, ReadableMap readableMap) {
        c0029as.f194d = true;
        c0029as.f195e = readableMap;
    }

    @InterfaceC9871jM0(customType = RemoteMessageAttributes.COLOR, name = "tintColor")
    public void setTintColor(C0029AS c0029as, Integer num) {
        if (num == null) {
            c0029as.clearColorFilter();
        } else {
            c0029as.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public C0029AS createViewInstance(S91 s91) {
        if (isValidContextForGlide(s91)) {
            this.requestManager = ComponentCallbacks2C1874a.m10888h(s91);
        }
        C0029AS c0029as = new C0029AS(s91);
        c0029as.f194d = false;
        c0029as.f195e = null;
        c0029as.f196f = null;
        return c0029as;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(C0029AS c0029as) {
        String string;
        super.onAfterUpdateTransaction((FastImageViewManager) c0029as);
        JR0 jr0 = this.requestManager;
        Map<String, List<C0029AS>> map = VIEWS_FOR_URLS;
        if (c0029as.f194d) {
            ReadableMap readableMap = c0029as.f195e;
            if ((readableMap == null || !readableMap.hasKey("uri") || (string = c0029as.f195e.getString("uri")) == null || string.trim().isEmpty()) && c0029as.f196f == null) {
                c0029as.m182c(jr0);
                E10 e10 = c0029as.f197g;
                if (e10 != null) {
                    FastImageOkHttpProgressGlideModule.forget(e10.m1982d());
                }
                c0029as.setImageDrawable(null);
                InterfaceC6947uP interfaceC6947uPM6091b = OZ1.m6091b((S91) c0029as.getContext(), c0029as.getId());
                FastImageErrorEvent fastImageErrorEvent = new FastImageErrorEvent(OZ1.m6094e(c0029as), c0029as.getId(), c0029as.f195e);
                if (interfaceC6947uPM6091b != null) {
                    interfaceC6947uPM6091b.mo11046g(fastImageErrorEvent);
                    return;
                }
                return;
            }
            FastImageSource fastImageSourceM26150a = AbstractC7202yS.m26150a(c0029as.getContext(), c0029as.f195e);
            if (fastImageSourceM26150a != null && fastImageSourceM26150a.getUri().toString().length() == 0) {
                InterfaceC6947uP interfaceC6947uPM6091b2 = OZ1.m6091b((S91) c0029as.getContext(), c0029as.getId());
                FastImageErrorEvent fastImageErrorEvent2 = new FastImageErrorEvent(OZ1.m6094e(c0029as), c0029as.getId(), c0029as.f195e);
                if (interfaceC6947uPM6091b2 != null) {
                    interfaceC6947uPM6091b2.mo11046g(fastImageErrorEvent2);
                }
                c0029as.m182c(jr0);
                E10 e102 = c0029as.f197g;
                if (e102 != null) {
                    FastImageOkHttpProgressGlideModule.forget(e102.m1982d());
                }
                c0029as.setImageDrawable(null);
                return;
            }
            E10 glideUrl = fastImageSourceM26150a == null ? null : fastImageSourceM26150a.getGlideUrl();
            c0029as.f197g = glideUrl;
            c0029as.m182c(jr0);
            String strM1982d = glideUrl != null ? glideUrl.m1982d() : null;
            if (glideUrl != null) {
                FastImageOkHttpProgressGlideModule.expect(strM1982d, this);
                List<C0029AS> list = map.get(strM1982d);
                if (list != null && !list.contains(c0029as)) {
                    list.add(c0029as);
                } else if (list == null) {
                    map.put(strM1982d, new ArrayList(Collections.singletonList(c0029as)));
                }
            }
            S91 s91 = (S91) c0029as.getContext();
            if (fastImageSourceM26150a != null) {
                InterfaceC6947uP interfaceC6947uPM6091b3 = OZ1.m6091b(s91, c0029as.getId());
                FastImageLoadStartEvent fastImageLoadStartEvent = new FastImageLoadStartEvent(OZ1.m6094e(c0029as), c0029as.getId());
                if (interfaceC6947uPM6091b3 != null) {
                    interfaceC6947uPM6091b3.mo11046g(fastImageLoadStartEvent);
                }
            }
            if (jr0 != null) {
                try {
                    C11671xR0 c11671xR0Listener = "gif".equals(FastImageUrlUtils.getFileExtensionFromUrl(fastImageSourceM26150a.getUri().toString())) ? jr0.asGif().load(fastImageSourceM26150a.getSourceForLoad()).apply(((PR0) AbstractC7202yS.m26151b(s91, fastImageSourceM26150a, c0029as.f195e).placeholder(c0029as.f196f)).fallback(c0029as.f196f)).listener(new FastImageRequestListener(strM1982d)) : jr0.load(fastImageSourceM26150a.getSourceForLoad()).apply(((PR0) AbstractC7202yS.m26151b(s91, fastImageSourceM26150a, c0029as.f195e).placeholder(c0029as.f196f)).fallback(c0029as.f196f));
                    if (strM1982d != null) {
                        c11671xR0Listener.listener(new FastImageRequestListener(strM1982d));
                    }
                    c11671xR0Listener.into(c0029as);
                } catch (Exception e) {
                    if (fastImageSourceM26150a != null) {
                        fastImageSourceM26150a.getUri().toString();
                    }
                    e.getMessage();
                }
            }
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(C0029AS c0029as) {
        c0029as.m182c(this.requestManager);
        E10 e10 = c0029as.f197g;
        if (e10 != null) {
            String strM1981c = e10.m1981c();
            FastImageOkHttpProgressGlideModule.forget(strM1981c);
            Map<String, List<C0029AS>> map = VIEWS_FOR_URLS;
            List<C0029AS> list = map.get(strM1981c);
            if (list != null) {
                list.remove(c0029as);
                if (list.size() == 0) {
                    map.remove(strM1981c);
                }
            }
        }
        super.onDropViewInstance((FastImageViewManager) c0029as);
    }
}
