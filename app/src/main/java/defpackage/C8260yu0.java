package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Trace;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.RetryableMountingLayerException;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.RootViewManager;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewManager;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import ru.mes.dnevnik.R;

/* renamed from: yu0 */
/* loaded from: classes.dex */
public class C8260yu0 {
    private static final String TAG = "yu0";
    private final boolean DEBUG_MODE;
    private final RectF mBoundingBox;
    private final C0333Ea0 mJSResponderHandler;
    private boolean mLayoutAnimationEnabled;
    private final C3439dh0 mLayoutAnimator;
    private HashMap<Integer, Set<Integer>> mPendingDeletionsForTag;
    private final SparseBooleanArray mRootTags;
    private final RootViewManager mRootViewManager;
    private final SparseArray<ViewManager> mTagsToViewManagers;
    private final SparseArray<View> mTagsToViews;
    private final ComponentCallbacks2C0754Jk1 mViewManagers;

    public C8260yu0(ComponentCallbacks2C0754Jk1 componentCallbacks2C0754Jk1) {
        RootViewManager rootViewManager = new RootViewManager();
        this.DEBUG_MODE = false;
        this.mJSResponderHandler = new C0333Ea0();
        this.mLayoutAnimator = new C3439dh0();
        this.mBoundingBox = new RectF();
        this.mViewManagers = componentCallbacks2C0754Jk1;
        this.mTagsToViews = new SparseArray<>();
        this.mTagsToViewManagers = new SparseArray<>();
        this.mRootTags = new SparseBooleanArray();
        this.mRootViewManager = rootViewManager;
    }

    public static String c(ViewGroup viewGroup, ViewGroupManager viewGroupManager, int[] iArr, C1920Yj1[] c1920Yj1Arr, int[] iArr2) {
        StringBuilder sb = new StringBuilder();
        if (viewGroup != null) {
            sb.append("View tag:" + viewGroup.getId() + " View Type:" + viewGroup.getClass().toString() + "\n");
            StringBuilder sb2 = new StringBuilder("  children(");
            sb2.append(viewGroupManager.getChildCount((ViewGroupManager) viewGroup));
            sb2.append("): [\n");
            sb.append(sb2.toString());
            for (int i = 0; viewGroupManager.getChildAt((ViewGroupManager) viewGroup, i) != null; i += 16) {
                int i2 = 0;
                while (true) {
                    int i3 = i + i2;
                    if (viewGroupManager.getChildAt((ViewGroupManager) viewGroup, i3) == null || i2 >= 16) {
                        break;
                    }
                    sb.append(viewGroupManager.getChildAt((ViewGroupManager) viewGroup, i3).getId() + StringUtils.COMMA);
                    i2++;
                }
                sb.append("\n");
            }
            sb.append(" ],\n");
        }
        if (iArr != null) {
            sb.append("  indicesToRemove(" + iArr.length + "): [\n");
            for (int i4 = 0; i4 < iArr.length; i4 += 16) {
                int i5 = 0;
                while (true) {
                    int i6 = i4 + i5;
                    if (i6 >= iArr.length || i5 >= 16) {
                        break;
                    }
                    sb.append(iArr[i6] + StringUtils.COMMA);
                    i5++;
                }
                sb.append("\n");
            }
            sb.append(" ],\n");
        }
        if (c1920Yj1Arr != null) {
            sb.append("  viewsToAdd(" + c1920Yj1Arr.length + "): [\n");
            for (int i7 = 0; i7 < c1920Yj1Arr.length; i7 += 16) {
                int i8 = 0;
                while (true) {
                    int i9 = i7 + i8;
                    if (i9 >= c1920Yj1Arr.length || i8 >= 16) {
                        break;
                    }
                    sb.append("[" + c1920Yj1Arr[i9].b + StringUtils.COMMA + c1920Yj1Arr[i9].a + "],");
                    i8++;
                }
                sb.append("\n");
            }
            sb.append(" ],\n");
        }
        if (iArr2 != null) {
            sb.append("  tagsToDelete(" + iArr2.length + "): [\n");
            for (int i10 = 0; i10 < iArr2.length; i10 += 16) {
                int i11 = 0;
                while (true) {
                    int i12 = i10 + i11;
                    if (i12 >= iArr2.length || i11 >= 16) {
                        break;
                    }
                    sb.append(iArr2[i12] + StringUtils.COMMA);
                    i11++;
                }
                sb.append("\n");
            }
            sb.append(" ]\n");
        }
        return sb.toString();
    }

    public synchronized void addRootView(int i, View view) {
        addRootViewGroup(i, view);
    }

    public final synchronized void addRootViewGroup(int i, View view) {
        try {
            if (view.getId() != -1) {
                String str = TAG;
                view.getId();
                AbstractC3393dS.e(str);
            }
            this.mTagsToViews.put(i, view);
            this.mTagsToViewManagers.put(i, this.mRootViewManager);
            this.mRootTags.put(i, true);
            view.setId(i);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void b(View view, int[] iArr) {
        this.mBoundingBox.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        RectF rectF = this.mBoundingBox;
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            matrix.mapRect(rectF);
        }
        rectF.offset(view.getLeft(), view.getTop());
        Object parent = view.getParent();
        while (parent instanceof View) {
            View view2 = (View) parent;
            rectF.offset(-view2.getScrollX(), -view2.getScrollY());
            Matrix matrix2 = view2.getMatrix();
            if (!matrix2.isIdentity()) {
                matrix2.mapRect(rectF);
            }
            rectF.offset(view2.getLeft(), view2.getTop());
            parent = view2.getParent();
        }
        iArr[0] = Math.round(this.mBoundingBox.left);
        iArr[1] = Math.round(this.mBoundingBox.top);
        RectF rectF2 = this.mBoundingBox;
        iArr[2] = Math.round(rectF2.right - rectF2.left);
        RectF rectF3 = this.mBoundingBox;
        iArr[3] = Math.round(rectF3.bottom - rectF3.top);
    }

    public void clearJSResponder() {
        C0333Ea0 c0333Ea0 = this.mJSResponderHandler;
        c0333Ea0.a = -1;
        ViewParent viewParent = c0333Ea0.b;
        if (viewParent != null) {
            viewParent.requestDisallowInterceptTouchEvent(false);
        }
        c0333Ea0.b = null;
    }

    public void clearLayoutAnimation() {
        this.mLayoutAnimator.reset();
    }

    public void configureLayoutAnimation(ReadableMap readableMap, Callback callback) {
        this.mLayoutAnimator.initializeFromConfig(readableMap, callback);
    }

    public synchronized void createView(S91 s91, int i, String str, NM0 nm0) {
        UiThreadUtil.assertOnUiThread();
        ArrayList arrayList = new ArrayList();
        arrayList.add("tag: " + String.valueOf(i));
        O90.f(str, "value");
        arrayList.add("className: " + str.toString());
        MT1.b("NativeViewHierarchyManager_createView".concat(""));
        try {
            ViewManager viewManagerA = this.mViewManagers.a(str);
            this.mTagsToViews.put(i, viewManagerA.createView(i, s91, nm0, null, this.mJSResponderHandler));
            this.mTagsToViewManagers.put(i, viewManagerA);
        } finally {
            Trace.endSection();
        }
    }

    public final Set d(int i) {
        if (this.mPendingDeletionsForTag == null) {
            this.mPendingDeletionsForTag = new HashMap<>();
        }
        if (!this.mPendingDeletionsForTag.containsKey(Integer.valueOf(i))) {
            this.mPendingDeletionsForTag.put(Integer.valueOf(i), new HashSet());
        }
        return this.mPendingDeletionsForTag.get(Integer.valueOf(i));
    }

    @Deprecated
    public synchronized void dispatchCommand(int i, int i2, ReadableArray readableArray) {
        UiThreadUtil.assertOnUiThread();
        View view = this.mTagsToViews.get(i);
        if (view == null) {
            throw new RetryableMountingLayerException("Trying to send command to a non-existing view with tag [" + i + "] and command " + i2);
        }
        resolveViewManager(i).receiveCommand((ViewManager) view, i2, readableArray);
    }

    public synchronized void dropView(View view) {
        try {
            UiThreadUtil.assertOnUiThread();
            if (view == null) {
                return;
            }
            if (this.mTagsToViewManagers.get(view.getId()) == null) {
                return;
            }
            if (!this.mRootTags.get(view.getId())) {
                resolveViewManager(view.getId()).onDropViewInstance(view);
            }
            ViewManager viewManager = this.mTagsToViewManagers.get(view.getId());
            if ((view instanceof ViewGroup) && (viewManager instanceof ViewGroupManager)) {
                ViewGroup viewGroup = (ViewGroup) view;
                ViewGroupManager viewGroupManager = (ViewGroupManager) viewManager;
                for (int childCount = viewGroupManager.getChildCount((ViewGroupManager) viewGroup) - 1; childCount >= 0; childCount--) {
                    View childAt = viewGroupManager.getChildAt((ViewGroupManager) viewGroup, childCount);
                    if (childAt == null) {
                        AbstractC3393dS.e(TAG);
                    } else if (this.mTagsToViews.get(childAt.getId()) != null) {
                        dropView(childAt);
                    }
                }
                viewGroupManager.removeAllViews(viewGroup);
            }
            this.mTagsToViews.remove(view.getId());
            this.mTagsToViewManagers.remove(view.getId());
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized int findTargetTagForTouch(int i, float f, float f2) {
        View view;
        UiThreadUtil.assertOnUiThread();
        view = this.mTagsToViews.get(i);
        if (view == null) {
            throw new JSApplicationIllegalArgumentException("Could not find view with tag " + i);
        }
        return AbstractC8394zb1.a(f, f2, (ViewGroup) view, AbstractC8394zb1.a);
    }

    public long getInstanceHandle(int i) {
        View view = this.mTagsToViews.get(i);
        if (view == null) {
            throw new C2262b60(AbstractC7209tN0.u(i, "Unable to find view for tag: "));
        }
        Long l = (Long) view.getTag(R.id.view_tag_instance_handle);
        if (l != null) {
            return l.longValue();
        }
        throw new C2262b60(AbstractC7209tN0.u(i, "Unable to find instanceHandle for tag: "));
    }

    public synchronized int getRootViewNum() {
        return this.mRootTags.size();
    }

    /* JADX WARN: Removed duplicated region for block: B:153:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x00a3 A[Catch: all -> 0x004b, TryCatch #0 {, blocks: (B:118:0x000d, B:120:0x0026, B:122:0x002c, B:124:0x0031, B:126:0x0035, B:128:0x003b, B:130:0x0043, B:136:0x004e, B:137:0x0078, B:139:0x007b, B:141:0x0083, B:143:0x008b, B:155:0x00a6, B:146:0x0093, B:148:0x0097, B:151:0x009d, B:154:0x00a3, B:156:0x00aa, B:157:0x00d4, B:158:0x00d5, B:159:0x00ff, B:162:0x0103, B:164:0x0106, B:166:0x0113, B:168:0x0117, B:170:0x011f, B:172:0x0145, B:171:0x013f, B:173:0x014c, B:174:0x0170, B:178:0x0175, B:180:0x0178, B:182:0x0186, B:185:0x0190, B:187:0x0196, B:190:0x019b, B:192:0x01ad, B:193:0x01af, B:194:0x01b2, B:195:0x01b8, B:196:0x01dc, B:197:0x01dd, B:199:0x01e3, B:203:0x01ef, B:204:0x020e), top: B:207:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void manageChildren(int r18, int[] r19, defpackage.C1920Yj1[] r20, int[] r21) {
        /*
            Method dump skipped, instructions count: 529
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8260yu0.manageChildren(int, int[], Yj1[], int[]):void");
    }

    public synchronized void measure(int i, int[] iArr) {
        UiThreadUtil.assertOnUiThread();
        View view = this.mTagsToViews.get(i);
        if (view == null) {
            throw new C0630Hv0("No native view for " + i + " currently exists");
        }
        View view2 = (View) YQ1.b(view);
        if (view2 == null) {
            throw new C0630Hv0("Native view " + i + " is no longer on screen");
        }
        b(view2, iArr);
        int i2 = iArr[0];
        int i3 = iArr[1];
        b(view, iArr);
        iArr[0] = iArr[0] - i2;
        iArr[1] = iArr[1] - i3;
    }

    public synchronized void measureInWindow(int i, int[] iArr) {
        UiThreadUtil.assertOnUiThread();
        View view = this.mTagsToViews.get(i);
        if (view == null) {
            throw new C0630Hv0("No native view for " + i + " currently exists");
        }
        view.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        iArr[0] = iArr[0] - rect.left;
        iArr[1] = iArr[1] - rect.top;
        iArr[2] = view.getWidth();
        iArr[3] = view.getHeight();
    }

    public synchronized void removeRootView(int i) {
        try {
            UiThreadUtil.assertOnUiThread();
            if (!this.mRootTags.get(i)) {
                SoftAssertions.assertUnreachable("View with tag " + i + " is not registered as a root view");
            }
            dropView(this.mTagsToViews.get(i));
            this.mRootTags.delete(i);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized View resolveView(int i) {
        View view;
        view = this.mTagsToViews.get(i);
        if (view == null) {
            throw new C2262b60("Trying to resolve view with tag " + i + " which doesn't exist");
        }
        return view;
    }

    public final synchronized ViewManager resolveViewManager(int i) {
        ViewManager viewManager;
        viewManager = this.mTagsToViewManagers.get(i);
        if (viewManager == null) {
            throw new C2262b60("ViewManager for tag " + i + " could not be found.\n");
        }
        return viewManager;
    }

    public void sendAccessibilityEvent(int i, int i2) {
        View view = this.mTagsToViews.get(i);
        if (view == null) {
            throw new RetryableMountingLayerException(AbstractC7209tN0.u(i, "Could not find view with tag "));
        }
        view.sendAccessibilityEvent(i2);
    }

    public synchronized void setChildren(int i, ReadableArray readableArray) {
        try {
            UiThreadUtil.assertOnUiThread();
            ViewGroup viewGroup = (ViewGroup) this.mTagsToViews.get(i);
            ViewGroupManager viewGroupManager = (ViewGroupManager) resolveViewManager(i);
            for (int i2 = 0; i2 < readableArray.size(); i2++) {
                View view = this.mTagsToViews.get(readableArray.getInt(i2));
                if (view == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Trying to add unknown view tag: ");
                    sb.append(readableArray.getInt(i2));
                    sb.append("\n detail: ");
                    C1920Yj1[] c1920Yj1Arr = new C1920Yj1[readableArray.size()];
                    for (int i3 = 0; i3 < readableArray.size(); i3++) {
                        c1920Yj1Arr[i3] = new C1920Yj1(readableArray.getInt(i3), i3);
                    }
                    sb.append(c(viewGroup, viewGroupManager, null, c1920Yj1Arr, null));
                    throw new C2262b60(sb.toString());
                }
                viewGroupManager.addView((ViewGroupManager) viewGroup, view, i2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public synchronized void setJSResponder(int i, int i2, boolean z) {
        if (!z) {
            this.mJSResponderHandler.a(i2, null);
            return;
        }
        View view = this.mTagsToViews.get(i);
        if (i2 != i && (view instanceof ViewParent)) {
            this.mJSResponderHandler.a(i2, (ViewParent) view);
            return;
        }
        if (this.mRootTags.get(i)) {
            SoftAssertions.assertUnreachable("Cannot block native responder on " + i + " that is a root view");
        }
        this.mJSResponderHandler.a(i2, view.getParent());
    }

    public void setLayoutAnimationEnabled(boolean z) {
        this.mLayoutAnimationEnabled = z;
    }

    public synchronized void updateInstanceHandle(int i, long j) {
        UiThreadUtil.assertOnUiThread();
        try {
            View viewResolveView = resolveView(i);
            UiThreadUtil.assertOnUiThread();
            viewResolveView.setTag(R.id.view_tag_instance_handle, Long.valueOf(j));
        } catch (C2262b60 unused) {
            AbstractC3393dS.h(TAG);
        }
    }

    public synchronized void updateLayout(int i, int i2, int i3, int i4, int i5, int i6) {
        UiThreadUtil.assertOnUiThread();
        ArrayList arrayList = new ArrayList();
        arrayList.add("parentTag: " + String.valueOf(i));
        arrayList.add("tag: " + String.valueOf(i2));
        MT1.b("NativeViewHierarchyManager_updateLayout".concat(""));
        try {
            View viewResolveView = resolveView(i2);
            viewResolveView.measure(View.MeasureSpec.makeMeasureSpec(i5, 1073741824), View.MeasureSpec.makeMeasureSpec(i6, 1073741824));
            ViewParent parent = viewResolveView.getParent();
            if (parent instanceof InterfaceC7418uT0) {
                parent.requestLayout();
            }
            if (!this.mRootTags.get(i)) {
                NativeModule nativeModule = (ViewManager) this.mTagsToViewManagers.get(i);
                if (!(nativeModule instanceof J50)) {
                    throw new C2262b60("Trying to use view with tag " + i + " as a parent, but its Manager doesn't implement IViewManagerWithChildren");
                }
                J50 j50 = (J50) nativeModule;
                if (j50 != null && !j50.needsCustomLayoutForChildren()) {
                    if (this.mLayoutAnimationEnabled && this.mLayoutAnimator.shouldAnimateLayout(viewResolveView)) {
                        this.mLayoutAnimator.applyLayoutUpdate(viewResolveView, i3, i4, i5, i6);
                    } else {
                        viewResolveView.layout(i3, i4, i5 + i3, i6 + i4);
                    }
                }
            } else if (this.mLayoutAnimationEnabled && this.mLayoutAnimator.shouldAnimateLayout(viewResolveView)) {
                this.mLayoutAnimator.applyLayoutUpdate(viewResolveView, i3, i4, i5, i6);
            } else {
                viewResolveView.layout(i3, i4, i5 + i3, i6 + i4);
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public synchronized void updateProperties(int i, NM0 nm0) {
        UiThreadUtil.assertOnUiThread();
        try {
            ViewManager viewManagerResolveViewManager = resolveViewManager(i);
            View viewResolveView = resolveView(i);
            if (nm0 != null) {
                viewManagerResolveViewManager.updateProperties(viewResolveView, nm0);
            }
        } catch (C2262b60 unused) {
            AbstractC3393dS.h(TAG);
        }
    }

    public synchronized void updateViewExtraData(int i, Object obj) {
        UiThreadUtil.assertOnUiThread();
        resolveViewManager(i).updateExtraData(resolveView(i), obj);
    }

    public synchronized void dispatchCommand(int i, String str, ReadableArray readableArray) {
        UiThreadUtil.assertOnUiThread();
        View view = this.mTagsToViews.get(i);
        if (view != null) {
            resolveViewManager(i).receiveCommand((ViewManager) view, str, readableArray);
        } else {
            throw new RetryableMountingLayerException("Trying to send command to a non-existing view with tag [" + i + "] and command " + str);
        }
    }
}
