package com.dalingge.gankio.common.utils;

/**
 * FileName: RxUtils.java
 * description:
 * Author: dingby(445850053@qq.com)
 * Date: 2016/5/7
 */
public class RxUtils {

//    public static Observable<File> saveImageAndGetPathObservable(final Context context, final String url, final String title) {
//         return  Observable.create(new Observer.OnSubscribe<Bitmap>() {
//            @Override
//            public void call(Subscriber<? super Bitmap> subscriber) {
//                Bitmap bitmap = null;
//                try {
//                    bitmap = Glide.with(context).load(url).asBitmap()
//                            .into(Target.SIZE_ORIGINAL, Target.SIZE_ORIGINAL)
//                            .get();
//                } catch (InterruptedException e) {
//                    subscriber.onError(e);
//                } catch (ExecutionException e) {
//                    subscriber.onError(e);
//                }
//                if (bitmap == null) {
//                    subscriber.onError(new Exception("无法下载到图片"));
//                }
//                subscriber.onNext(bitmap);
//                subscriber.onCompleted();
//            }
//        }).flatMap(new Func1<Bitmap, Observable<File>>() {
//            @Override
//            public Observable<File> call(Bitmap bitmap) {
//                File file = new File(Environment.getExternalStorageDirectory(), "gank");
//                if (!file.exists()) {
//                    file.mkdir();
//                }
//                String fileName = title + ".jpg";
//                File pictureFile = new File(file, fileName);
//                try {
//                    FileOutputStream fos = new FileOutputStream(pictureFile);
//                    assert bitmap != null;
//                    bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fos);
//                    fos.flush();
//                    fos.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//                return Observable.just(pictureFile);
//            }
//        }).doOnNext(file -> MediaScannerConnection.scanFile(context.getApplicationContext(),
//                         new String[]{file.getPath()}, null, null)
//       ).subscribeOn(Schedulers.io());
//    }
}
