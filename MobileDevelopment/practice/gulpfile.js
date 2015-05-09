var gulp = require('gulp');
var concat = require('gulp-concat');
var inject = require('gulp-inject');

gulp.task('default', function(){
	var target = gulp.src('page.html');
	var sources = gulp.src(['/scripts/*js','/style/*.css'],{read:false});
	
	return target.pipe(inject(sources)).pipe(gulp.dest('.'));
	//return gulp.src('/scripts/*.js').pipe(concat('all.js')).pipe(gulp.dest('./dist/'));

});