package saproject.teacherservice.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import saproject.teacherservice.ExceptionHandling.TeacherException;
import saproject.teacherservice.domain.Teacher;
import saproject.teacherservice.service.TeacherService;
@RestController
@RequestMapping("/teacher")
public class TeacherController {
    @Autowired
    private TeacherService teacherService;

    @PostMapping("/add")
    public String addTeacher(@RequestBody Teacher teacher) {
        try {
            teacherService.addTeacher(teacher);
            return "Teacher added";
        } catch (TeacherException e) {
            return e.getMessage();
        }
    }

    @DeleteMapping("/delete/{id}")
    public String deleteTeacher(@PathVariable int id) {
        try {
            teacherService.deleteTeacher(id);
            return "Teacher deleted";
        } catch (TeacherException e) {
            return e.getMessage();
        }
    }

    @PutMapping("/update")
    public String updateTeacher(@RequestBody Teacher teacher) {
        try {
            teacherService.updateTeacher(teacher);
            return "Teacher updated";
        } catch (TeacherException e) {
            return e.getMessage();
        }
    }

    @GetMapping("/get/{id}")
    public String getTeacher(@PathVariable int id) {
        try {
            return teacherService.getTeacher(id).toString();
        } catch (TeacherException e) {
            return e.getMessage();
        }

    }
}