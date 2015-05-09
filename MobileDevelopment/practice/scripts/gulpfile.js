var gulp = require('gulp');
var concat = require('gulp-concat');

gulp.task('default', function(){

	return gulp.src('/scripts/*.js').pipe(concat('all.js')).pipe(gulp.dest('./dist/'));

});